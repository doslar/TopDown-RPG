package util;

import java.awt.image.BufferedImage;

public class SpriteSheet {

	private BufferedImage sheet;
	private int width;
	private int height;
	private int rows;
	private int collums;
	
	public SpriteSheet(BufferedImage sheet) {
		this.sheet=sheet;
	}
	
	
	public SpriteSheet(BufferedImage sheet, int width, int height, int rows, int collums) {
		this.sheet = sheet;
		this.width=width;
		this.height=height;
		this.rows=rows;
		this.collums=collums;
	}
	
	public BufferedImage crop(int x,int y,int width,int height) {
		return sheet.getSubimage(x, y, width, height);
	}
	
	public BufferedImage getSprite(int num) {
		int y = 0;

		
		while(num>collums) {
			num=num-(collums+1);
			y++;
		}
		
		return crop(num*width, y*height, width, height);
	}
}
