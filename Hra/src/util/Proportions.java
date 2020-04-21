package util;

public class Proportions {
	int width;
	int height;
	int thicness;
	
	public Proportions(int width, int height) {
		this.width=width;
		this.height=height;
		this.thicness=width;
	}
	
	public Proportions(int width, int height, int thicness) {
		this.width=width;
		this.height=height;
		this.thicness=thicness;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getThicness() {
		return thicness;
	}

	public void setThicness(int thicness) {
		this.thicness = thicness;
	}
	
}
