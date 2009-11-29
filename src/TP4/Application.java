package TP4;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class Application
{
	
//http://www.iam.ubc.ca/guides/javatut99/uiswing/layout/example-swing/GridBagWindow.java
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		VueImage im = new VueImage();
		frame.add(im);
		
		VueDonnees don = new VueDonnees();
		frame.add(don);

		VueVignette vi = new VueVignette();
		frame.add(vi);
		
		frame.setSize(500,500);
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
//		frame.setResizable(false);
	}

}
