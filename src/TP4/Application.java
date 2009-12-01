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
	JMenu menu = new JMenu("Menu");
	JMenuItem menuItem;
	
	public static void main(String[] args)
	{
		Application app = new Application();
		JFrame frame = new JFrame();
		
		VueImage im = new VueImage();
		frame.add(im);
		
		VueDonnees don = new VueDonnees();
		frame.add(don);

		VueVignette vi = new VueVignette();
		frame.add(vi);
		
		new Target().setImage("DoIt.jpg");
		
		frame.setJMenuBar(app.menuBar);
		app.menuBar.add(app.menu);
		app.createMenu(app);
		
		frame.setSize(500,550);//527
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	private void createMenu(Application app)
	{
		app.undoMenu();
		app.redoMenu();
		app.copierMenu();
		app.collerMenu();
	}
	
	private void undoMenu()
	{
		menuItem = new JMenuItem("Undo");
		menu.add(menuItem);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new Listeners().getUndoListener());
	}
	
	private void redoMenu()
	{
		menuItem = new JMenuItem("Redo");
		menu.add(menuItem);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new Listeners().getRedoListener());
	}
	
	private void copierMenu()
	{
		menuItem = new JMenuItem("Copier");
		menu.add(menuItem);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new Listeners().getCopyListener());
	}
	
	private void collerMenu()
	{
		menuItem = new JMenuItem("Coller");
		menu.add(menuItem);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new Listeners().getPasteListener());
	}
}
