package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int color = in.nextInt();
		int color2 = in.nextInt();
		int color3 = in.nextInt();
		boolean filled = in.nextBoolean();
		double param = in.nextDouble();
		double param2 = in.nextDouble();
		double param3 = in.nextDouble();
		double param4 = in.nextDouble();		
		StdDraw.setPenColor(color, color2, color3);
		if (shapeType.equals("ellipse"))
			{
			if (filled)
			{
				StdDraw.filledEllipse(param, param2, param3, param4);
			}
			else
			{
				StdDraw.ellipse(param, param2, param3, param4);
			}
			}
	}
}
