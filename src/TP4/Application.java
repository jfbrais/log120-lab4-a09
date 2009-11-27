package TP4;

import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class Application
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.add(new VueDonnees());
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
	}

}
