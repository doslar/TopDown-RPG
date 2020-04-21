package states;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Entity;
import entities.Entity_Rock;
import entities.Entity_Test;
import levels.Level;
import util.Constants;
import util.GameCamera;
import util.Proportions;
import util.Vector2;

public class State_Game extends State{
	
	private List<Entity> entities;
	private Level currentLevel;
	private static GameCamera camera = new GameCamera();
	private Comparator<Entity> comparator;
	
	public State_Game() {
		entities = new ArrayList<Entity>();
		
		addEntity(new Entity_Test(new Vector2(50,50),new Proportions(100, 100, 100)));
		addEntity(new Entity_Rock(new Vector2(100,100),new Proportions(50,50)));
		
		currentLevel= new Level("res/worlds/world1.txt");
		
		comparator = new Comparator<Entity>() {

			@Override
			public int compare(Entity e1, Entity e2) {
				int compareValue= Integer.compare((int)e1.getPossition().getY(),(int) e2.getPossition().getY());
				return compareValue;
			}
		};
		
		
		}
	
	@Override
	public void update() {
		currentLevel.update();
		for(Entity go : entities){
			go.update();
		}
	}

	@Override
	public void render(Graphics2D g2) {
		
		g2.translate(-(camera.getX()-(Constants.WINDOW_WIDTH/2)), -(camera.getY()-(Constants.WINDOW_HEIGHT/2)));
		currentLevel.render(g2);
		entities.sort(comparator);
		for(Entity go : entities){
			go.render(g2);
		}
		
		g2.translate((camera.getX()-(Constants.WINDOW_WIDTH/2)), (camera.getY()-(Constants.WINDOW_HEIGHT/2)));

		//g2.drawLine(Constants.WINDOW_WIDTH/2, 0, Constants.WINDOW_WIDTH/2, Constants.WINDOW_HEIGHT);
		//g2.drawLine(0, Constants.WINDOW_HEIGHT/2, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT/2);
	}

	public void addEntity(Entity entity) {
		entities.add(entity);
	}

	public static GameCamera getCamera() {
		return camera;
	}

	public static void setCamera(GameCamera camera) {
		State_Game.camera = camera;
	}

}
