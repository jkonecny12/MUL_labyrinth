/**
 * Starting class with main  game loop
 */
package game;

import javax.swing.JFrame;
import library.ImageLibrary;

/**
 * @author Jiri Konecny <xkonec28>
 * @author Tomas Kimer <xkimer00>
 */
public class GameStart{
	final static private String imagesFile = "resources/terrain.png";
	final static private int imagesResolution = 32;
	
	/**
	 * Constructor
	 */
	public GameStart(){
	}
	
	/**
	 * @param args No use
	 */
	public static void main(String[] args) {
		ImageLibrary iLibrary = new ImageLibrary(imagesFile, imagesResolution);
		
		JFrame frame = new JFrame("Labyrinth game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new GamePanel(iLibrary)); //@TODO out of this code
		frame.setSize(100, 100);
		frame.setVisible(true);
	}

}
