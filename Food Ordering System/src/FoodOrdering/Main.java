package FoodOrdering;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		  Font customFont = new Font("Serif", Font.PLAIN, 16);

	        try {
	            File fontFile = new File("InriaSerif-Regular.ttf");
	            customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(16f);

	            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	            ge.registerFont(customFont);
	        } catch (FontFormatException | IOException e) {
	            System.err.println("Failed to load custom font. Using default.");
	            e.printStackTrace();
	        }
	        try {
	            	            File fontFile = new File("Italiana-Regular.ttf");
	            customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(16f);

	            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	            ge.registerFont(customFont);
	        } catch (FontFormatException | IOException e) {
	            System.err.println("Failed to load custom font. Using default.");
	            e.printStackTrace();
	        }
	        try {
	            File fontFile = new File("IslandMoments-Regular.ttf");
	            customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(16f);

	            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	            ge.registerFont(customFont);
	        } catch (FontFormatException | IOException e) {
	            System.err.println("Failed to load custom font. Using default.");
	            e.printStackTrace();
	        }
	        try {
	            File fontFile = new File("RobotoMono-Light.ttf");
	            customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(16f);

	            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	            ge.registerFont(customFont);
	        } catch (FontFormatException | IOException e) {
	            System.err.println("Failed to load custom font. Using default.");
	            e.printStackTrace();
	        }
	        try {
	            File fontFile = new File("LibreBarcode128-Regular.ttf");
	            customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(16f);

	            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	            ge.registerFont(customFont);
	        } catch (FontFormatException | IOException e) {
	            System.err.println("Failed to load custom font. Using default.");
	            e.printStackTrace();
	        }
		OrderingFrame frame = new OrderingFrame();
	}

}