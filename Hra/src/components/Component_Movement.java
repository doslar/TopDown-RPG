package components;

import entities.Entity;
import util.Vector2;

public class Component_Movement extends Component{

	private Vector2 movement;
	
	public Component_Movement(Entity entity) {
		super(entity, "Movement");
		movement = new Vector2(0,0);
	}
	
	public void forceMove(Vector2 v2) {
		movement.addVector2(v2);
	}
	
	public void walk(Vector2 v2, float maxSpeed) {
		movement.addVector2(v2, maxSpeed);
	}
	
	public void slowDownX(float speed) {
		movement.slowDownX(speed);
	}
	
	public void slowDownY(float speed) {
		movement.slowDownY(speed);
	}
	
	@Override
	public void update() {
		entity.getPossition().addVector2(movement);
	}
}
