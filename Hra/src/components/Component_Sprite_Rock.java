package components;

import java.awt.Graphics2D;

import entities.Entity;
import util.Assets;

public class Component_Sprite_Rock extends Component{

	public Component_Sprite_Rock(Entity entity) {
		super(entity, "Sprite");
		
	}
	
	@Override
	public void render(Graphics2D g2) {
		g2.drawImage(Assets.rock,(int)entity.getX(),(int)entity.getY(),entity.getWidth(),entity.getHeight(),null);
	}
}
