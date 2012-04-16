package library;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;

/**
 * @author Jiri Konecny <xkonec28>
 * @author Tomas Kimer <xkimer00>
 * 
 * Load and get needed images
 */
public class ImageLibrary {
	private List<BufferedImage> textures;
	
	/**
	 * Create object and load images
	 * @param name Name of the file with images
	 * @param resolution Resolution of one image in file
	 */
	public ImageLibrary(String name, int resolution){
		BufferedImage img = null;
		textures = new ArrayList<BufferedImage>();
		
		// load image from file
		try {
			img = ImageIO.read(new File(name));
		} catch (IOException e) {
			System.err.println("Error: Image file can't be loaded.");
			e.printStackTrace();
			System.exit(1);
		}
		
		// image must have good resolution for parsing
		if((img.getWidth() % resolution != 0) && (img.getHeight() % resolution != 0))
		{
			System.err.println("Error: Image have bad resolution.");
			System.exit(1);
		}
		
		// parse large image on images with given resolution
		for(short y = 0; y < img.getWidth(); y += resolution){
			for(short x = 0; x < img.getHeight(); x += resolution){
				textures.add(img.getSubimage(x, y, resolution, resolution));
			}
		}
		
	}
	
	public Image getImageTile(int index){
		return(textures.get(index));
	}
}
