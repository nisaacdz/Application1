package library.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class Variables {

	public static Dimension pcSize = Toolkit.getDefaultToolkit().getScreenSize();

	public static int pcWidth = pcSize.width;
	public static int pcHeight = pcSize.height;

	public static int pcMenuHeight = (int) ((double) (pcHeight * 0.056));

	public static int widthOne = (int) ((double) (pcWidth * 0.18));
	public static int widthTwo = (int) ((double) (pcWidth * 0.68));
	public static int widthThree = pcWidth - widthOne - widthTwo;
	public static int width23 = widthTwo + widthThree;

	public static int heightOne = pcHeight - pcMenuHeight;
	public static int heightTwo = (int) ((double) (heightOne * 2 / 3));
	public static int heightThree = heightOne - heightTwo;

	private static int minWidthL = (int) ((double) 0.0367 * pcWidth);
	private static int minWidthCR = 2 * minWidthL;
	private static int minWidthCRB = minWidthCR;
	private static int minWidthB = minWidthCRB;
	private static int minWidthR = (int) ((double) 0.2 * minWidthCR);
	private static int minWidthC = minWidthCR - minWidthR;

	private static int minHeightCR = (int) ((double) 0.13 * pcHeight);
	private static int minHeightCRB = (int) ((double) 0.15625 * pcWidth);
	private static int minHeightL = minHeightCRB;
	private static int minHeightB = (int) ((double) 0.059 * pcHeight);
	private static int minHeightR = minHeightCR;
	private static int minHeightC = minHeightCR;

	private static int maxWidthL = (int) ((double) 0.37 * pcWidth);
	private static int maxWidthR = maxWidthL;
	private static int maxWidthB = pcWidth - minWidthL;
	private static int maxWidthCRB = pcWidth;
	private static int maxWidthC = maxWidthCRB;

	private static int maxHeightCRB = pcHeight;
	private static int maxHeightL = pcHeight;
	private static int maxHeightR = maxHeightCRB;
	private static int maxHeightB = (int) ((double) 0.6 * pcHeight);
	private static int maxHeightC = maxHeightCRB;

	public static Dimension lefMinSize = new Dimension(minWidthL, minHeightL);
	public static Dimension cenRMinSize = new Dimension(minWidthCR, minHeightCR);
	public static Dimension cenMinSize = new Dimension(minWidthC, minHeightC);
	public static Dimension rigMinSize = new Dimension(minWidthR, minHeightR);
	public static Dimension cenRBMinSize = new Dimension(minWidthCRB, minHeightCRB);
	public static Dimension botMinSize = new Dimension(minWidthB, minHeightB);

	public static Dimension lefMaxSize = new Dimension(maxWidthL, maxHeightL);
	public static Dimension cenRBMaxSize = new Dimension(maxWidthCRB, maxHeightCRB);
	public static Dimension cenMaxSize = new Dimension(maxWidthC, maxHeightC);
	public static Dimension rigMaxSize = new Dimension(maxWidthR, maxHeightR);
	public static Dimension botMaxSize = new Dimension(maxWidthB, maxHeightB);

	// Colors
	public static Color white = new Color(255, 255, 255);
	public static Color black = new Color(0, 0, 0);
	public static Color color02 = new Color(60, 60, 60);
	public static Color light = new Color(220, 220, 255);
	public static Color mix = new Color(150, 180, 210);
	public static Color javaDefault = new Color(204, 204, 204);
	public static Color distinct = new Color(180, 55, 55);
	public static Color ciel = new Color(0, 55, 55);
	public static Color darkGrey = new Color(88, 88, 88);
	public static Color lightGrey = new Color(230, 230, 230);

	// Fonts
	public static Font font00 = new Font("", 10, Font.BOLD);
	public static Font font01 = new Font("", 10, Font.BOLD);
	public static Font font02 = new Font("", 10, Font.BOLD);
	public static Font font03 = new Font("", 10, Font.BOLD);

	// Fonts
	public static String text000 = "Grapher Demo 00";
	public static String text001 = "Grapher Demo 00";
	public static String text002 = "Grapher Demo 00";
	public static String text003 = "Grapher Demo 00";
	public static String text004 = "Grapher Demo 00";
	public static String text005 = "Grapher Demo 00";
	public static String text006 = "Grapher Demo 00";
	public static String text007 = "Grapher Demo 00";
	public static String text008 = "Grapher Demo 00";

}
