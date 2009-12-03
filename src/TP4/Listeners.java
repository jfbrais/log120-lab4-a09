package TP4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JOptionPane;

public class Listeners implements MouseMotionListener, MouseWheelListener, MouseListener
{
	private CommandManager manager = new CommandManager();
	private CareTaker careTaker = CareTaker.getInstance();
	private int posX = 0, posY = 0;
	private int posXinit = 0, posYinit = 0;
	private boolean dragging = false;
	
	@Override
	public void mouseDragged(MouseEvent arg0)
	{
		createCommand("move",String.valueOf(arg0.getX()-posX),String.valueOf(arg0.getY()-posY),true,false);
		
		posX = arg0.getX();
		posY = arg0.getY();
	}

	@Override
	public void mouseMoved(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent arg0)
	{
		createCommand("changeZoom", String.valueOf(10*arg0.getWheelRotation()));
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		if (e.getY() > 420)
		{		
			if (e.getX() > 175 && e.getX() < 275)		
			{createCommand("changeImage", "TICSH.jpg");}
			
			if (e.getX() > 275 && e.getX() < 375)	
			{createCommand("changeImage", "DoIt.jpg");}
			
			if (e.getX() > 375 && e.getX() < 475)	
			{createCommand("changeImage", "Jack.jpg");}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		if (e.getY() < 420)
		{
			dragging = true;
			posX = e.getX();
			posY = e.getY();
			posXinit = e.getX();
			posYinit = e.getY();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		if (dragging)
		{
			dragging = false;
			createCommand("move",String.valueOf(e.getX()-posXinit),String.valueOf(e.getY()-posYinit),false,true);
			
			posX = e.getX();
			posY = e.getY();
		}
	}
	
	public ActionListener getQuitListener()
	{
		return new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		};
	}
	
	public ActionListener getUndoListener()
	{
		return new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				ABSCommand undo = careTaker.getUndoMemento();
				if (undo!=null)
				{
					undo.undoIt();
				}
			}
		};
	}
	
	public ActionListener getRedoListener()
	{
		return new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				ABSCommand redo = careTaker.getRedoMemento();
				if (redo!=null)
				{
					redo.doIt();
				}		
			}
		};
	}
	
	public ActionListener getCopyListener()
	{
		return new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				PasteIF.getInstance().copy();
			}
		};
	}
	
	public ActionListener getPasteListener()
	{
		return new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				PasteIF.getInstance().pasteIt();			
			}
		};
	}
	
	public ActionListener getAboutListener()
	{
		return new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, 
						"<HTML><P>&copy;&nbsp; 2009 <tt>Gabriel Desmarais</tt> and his team...</p><p></html>",
						"About",
						JOptionPane.INFORMATION_MESSAGE);		
			}
		};
	}
	
	public void createCommand(String type, String arg0)
	{
		ABSCommand cmd = manager.createCommand(type,arg0);
		
		if (cmd!=null)
		{
			cmd.doIt();
			careTaker.addMemento(cmd);
		}
	}
	
	public void createCommand(String type, String arg0, String arg1, boolean doIt, boolean memento)
	{
		ABSCommand cmd = manager.createCommand(type,arg0,arg1);
		
		if (cmd!=null)
		{
			if (doIt)
				cmd.doIt();
			
			if (memento)
				careTaker.addMemento(cmd);
		}
	}
	
	public void createCommand(String arg0, String arg1, String arg2, String arg3)
	{
		ABSCommand all = manager.createCommand(arg0,arg1,arg2,arg3);
		
		if (all!=null)
		{
			all.doIt();
			careTaker.addMemento(all);
		}
	}
}
