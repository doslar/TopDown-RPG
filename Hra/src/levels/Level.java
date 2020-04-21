package levels;

import java.awt.Graphics2D;

import tiles.Tile;
import util.Utils;

public class Level {
	//Columns, Rows
	private int[][] tileMap;
	private int width, height;
	private int spawnX, spawnY;
	
	
	public Level(String path) {
		loadLevel(path);
	}
	
	private void loadLevel(String path) {
		
		String file = Utils.loadFileAsString(path);
		
		String[] tokens = file.split("\\s+");
		
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tileMap = new int[width][height];
		
		
		for(int r = 0; r<height;r++) {
			for(int c = 0; c<width;c++) {
				tileMap[c][r]=Utils.parseInt(tokens[(c+r*width)+4]);
			}
		}
	}
	
	
	public void update() {
		
	}
	
	public void render(Graphics2D g2) {
		for(int r = 0; r<height;r++) {
			for(int c = 0; c<width;c++) {
				getTile(c,r).render(g2, c, r);;
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		Tile t = Tile.tileSet.get(tileMap[x][y]);
		if(t==null)
			return Tile.tileSet.get(0);
		return t;
	}
}
