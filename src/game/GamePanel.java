package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import library.ImageLibrary;

/**
 * @author Jiri Konecny <xkonec28>
 * @author Tomas Kimer <xkimer00>
 * 
 * Draw game table
 */
public class GamePanel extends JPanel{
	private ImageLibrary iLib = null;
	/**
	 * Generated for serialization of the class
	 */
	private static final long serialVersionUID = -4270704324376844467L;

	GamePanel(ImageLibrary iLib){
		super();
		this.iLib = iLib;
	}
	
	/**
	 * Override method for painting the game
	 */
	public void paintComponent(Graphics g){
		int width = getWidth();
		int height = getHeight();
		BufferedImage img = (BufferedImage)iLib.getImageTile(200);
		
		g.drawOval(20, 20, 10, 10);
		g.drawImage(img, 0, 0, this);
		
	}
}
