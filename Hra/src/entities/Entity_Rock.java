package entities;

import components.Component_Sprite_Rock;
import util.Proportions;
import util.Vector2;

public class Entity_Rock extends Entity{

	public Entity_Rock(Vector2 posstion, Proportions proportions) {
		super("Rock", posstion, proportions);
		
		addComponent(new Component_Sprite_Rock(this));
	}
	
}
