package TP4;

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
//		im.setBounds(0, 0, 500, 420);
		frame.add(im);
		
		VueDonnees don = new VueDonnees();
//		don.setBounds(0, 420, 150, 80);
		frame.add(don);

		VueVignette vi = new VueVignette();
//		vi.setBounds(150, 420, 350, 80);
		frame.add(vi);
		
		new Target().setImage("TICSH.jpg");
		
		frame.setSize(500,527);
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
		frame.setResizable(false);
	}

}
