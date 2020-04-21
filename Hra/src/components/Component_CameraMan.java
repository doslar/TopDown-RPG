package components;

import entities.Entity;
import states.State_Game;
import util.Constants;
import util.Vector2;

public class Component_CameraMan extends Component{

	public Component_CameraMan(Entity entity) {
		super(entity, "CameraMan");
		
	}
	public void update() {
		State_Game.getCamera().setPossition(entity.getPossition());
	}
	//Constants.WINDOW_WIDTH/2,Constants.WINDOW_HEIGHT/2
}
