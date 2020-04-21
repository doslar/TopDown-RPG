package tiles;

import java.awt.image.BufferedImage;

import util.Assets;

public class Tile_RedFlowers extends Tile{

	public Tile_RedFlowers(int id) {
		super(Assets.redFlowers, id);
		setObstacle(1);
	}

}
