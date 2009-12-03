package TP4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

public class Application
{
	JMenuBar menuBar = new JMenuBar();
	JMenu menu;
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
		app.createMenu(app);
		
		frame.setSize(500,550);//527
//		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
		frame.setResizable(false);
		
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	private void createMenu(Application app)
	{
		app.menu = new JMenu("File");
		app.quitMenu();
		app.menuBar.add(app.menu);
		
		app.menu = new JMenu("Edit");
		app.undoMenu();
		app.redoMenu();
		app.copierMenu();
		app.collerMenu();
		app.menuBar.add(app.menu);
		
		app.menu = new JMenu("?");
		app.aboutMenu();
		app.menuBar.add(app.menu);
	}
	
	private void quitMenu()
	{
		menuItem = new JMenuItem("Quit");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new Listeners().getQuitListener());
		menu.add(menuItem);
	}
	
	private void undoMenu()
	{
		menuItem = new JMenuItem("Undo");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new Listeners().getUndoListener());
		menu.add(menuItem);
	}
	
	private void redoMenu()
	{
		menuItem = new JMenuItem("Redo");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new Listeners().getRedoListener());
		menu.add(menuItem);
	}
	
	private void copierMenu()
	{
		menuItem = new JMenuItem("Copier");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new Listeners().getCopyListener());
		menu.add(menuItem);
	}
	
	private void collerMenu()
	{
		menuItem = new JMenuItem("Coller");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new Listeners().getPasteListener());
		menu.add(menuItem);
	}
	
	private void aboutMenu()
	{
		menuItem = new JMenuItem("About");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		menuItem.addActionListener(new Listeners().getAboutListener());
		menu.add(menuItem);
	}
}
