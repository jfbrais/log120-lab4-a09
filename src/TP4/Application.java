package TP4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Application
{
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("Edit");
	JMenuItem menuItem;
//http://www.iam.ubc.ca/guides/javatut99/uiswing/layout/example-swing/GridBagWindow.java
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Application leMenu = new Application();
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
		
		new Target().setImage("DoIt.jpg");
		
		frame.setSize(500,550);//527
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
		frame.setResizable(false);
		
        
		frame.setJMenuBar(leMenu.menuBar);
		leMenu.menuBar.add(leMenu.menu);
		leMenu.undoMenu();
		leMenu.redoMenu();
		leMenu.copierMenu();
		leMenu.collerMenu();
	}
	
	private void undoMenu()
	{
	menuItem = new JMenuItem("Undo");
	menu.add(menuItem);
	menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
	menuItem.addActionListener(new UndoListener());
	}
	
	private void redoMenu()
	{
		menuItem = new JMenuItem("Redo");
		menu.add(menuItem);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new RedoListener());
	}
	
	private void copierMenu()
	{
		menuItem = new JMenuItem("Copier");
		menu.add(menuItem);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new CopierListener());
	}
	
	private void collerMenu()
	{
		menuItem = new JMenuItem("Coller");
		menu.add(menuItem);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new CollerListener());
	}
	
	
	class UndoListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Undo");
		}
	}
	
	class RedoListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Redo");
		}
	}

	class CopierListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("copier");
		}
	}
	
	class CollerListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("coller");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
