package entities;

import components.Component;
import components.Component_CameraMan;
import components.Component_Movement;
import components.Component_PlayerMovement;
import components.Component_Sprite_Rogue;
import components.Component_Stats;
import main.Game;
import util.Proportions;
import util.Vector2;

public class Entity_Test extends Entity{

	public Entity_Test( Vector2 posstion, Proportions proportions) {
		super("TestEntity", posstion, proportions);
	}

	@Override
	protected void init() {
		this.addComponent(new Component(this,"test"));
		this.addComponent(new Component_Stats(this, 5, 5, 5, 5, 5, 5));
		this.addComponent(new Component_Movement(this));
		this.addComponent(new Component_PlayerMovement(this));
		this.addComponent(new Component_Sprite_Rogue(this));
		this.addComponent(new Component_CameraMan(this));
	}
}
