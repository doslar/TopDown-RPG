package util;

public class Vector2 {
	private float x;
	private float y;
	
	public Vector2() {
		setX(0);
		setY(0);
	}

	public Vector2(float x,float y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Vector2(Vector2 v2) {
		this.setX(v2.getX());
		this.setY(v2.getY());
	}
	
	public void addVector2(Vector2 v2) {
		this.setX(this.getX()+v2.getX());
		this.setY(this.getY()+v2.getY());
	}
	
	public void addVector2(Vector2 v2, float maxNumber) {
		if(this.getX()<=maxNumber && this.getX()>=(maxNumber*-1)) {
			this.setX(this.getX()+v2.getX());
			
			if(this.getX()>maxNumber ) {
				this.setX(maxNumber);
			}
			
			if(this.getX()<(maxNumber*-1)) {
				this.setX(maxNumber*-1);
			}
				
		}
		
		if(this.getY()<=maxNumber && this.getY()>=(maxNumber*-1)) {
			this.setY(this.getY()+v2.getY());
			if(this.getY()>maxNumber ) {
				this.setY(maxNumber);
			}
			
			if(this.getY()<(maxNumber*-1)) {
				this.setY(maxNumber*-1);
			}
				
		}
			
	}
	
	public void slowDownX(float num) {
		if(this.getX()!=0.0) {
			if(this.getX()<0) {
				this.setX(this.getX()+num);
				if(this.getX()>0)
					this.setX(0);
			}
			
			if(this.getX()>0) {
				this.setX(this.getX()-num);
				if(this.getX()<0)
					this.setX(0);
			}
		}
	}	
		public void slowDownY(float num) {	
		if(this.getY()!=0.0) {
			if(this.getY()<0) {
				this.setY(this.getY()+num);
				if(this.getY()>0)
					this.setY(0);
			}
			
			if(this.getY()>0) {
				this.setY(this.getY()-num);
				if(this.getY()<0)
					this.setY(0);
			}
		}
	}
	
	public Vector2 multiply(float num) {
		setX(getX()*num);
		setY(getY()*num);
		
		
		return this;
	}
	
	public int getNumDirection() {
		int x = 0;
		int y = 0;
		
		if(getX()>0) {
			x=1;
		}

		else {
			if(getX()<0) {
				x=-1;
			}
		}	
		
		if(getY()>0) {
			y=5;
		}

		else {
			if(getY()<0) {
				y=-5;
			}
		}	
		
		switch (x+y) {
			case 1 : return 0;

			case -4 : return 4;
			
			case 6 : return 7;
			
			case 5 : return 3;
			
			case -5 : return 1;
			
			case -1 : return 2;
			
			case -6 : return 5;
			
			case 4 : return 6;
			
			
			default : return 9;
		}
		
	
	}
	

	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return ("["+x+","+y+"]");
	}
	
	public void setVector2(Vector2 v2) {
		this.setX(v2.getX());
		this.setY(v2.getY());
	}
}
