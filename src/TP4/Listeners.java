package TP4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Listeners implements MouseMotionListener, MouseWheelListener, MouseListener
{
	CommandManager manager = new CommandManager();
	CareTaker careTaker = CareTaker.getInstance();
	
	@Override
	public void mouseDragged(MouseEvent arg0)
	{
		ABSCommand moveX = manager.createCommand("moveX",String.valueOf(arg0.getX()));
		ABSCommand moveY = manager.createCommand("moveY",String.valueOf(arg0.getY()));
		
		if (moveX!=null)
		{
			moveX.doIt();
			careTaker.addMemento(moveX);
		}
		
		if (moveY!=null)
		{
			moveY.doIt();
			careTaker.addMemento(moveY);
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent arg0)
	{
		ABSCommand changeZoom = manager.createCommand("changeZoom", String.valueOf(10*arg0.getWheelRotation()));
		
		if (changeZoom!=null)
		{
			changeZoom.doIt();
			careTaker.addMemento(changeZoom);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		ABSCommand changeImage = null;
		
		if (e.getX() > 175 && e.getX() < 275)		
		{changeImage = manager.createCommand("changeImage", "TICSH.jpg");}
		
		if (e.getX() > 275 && e.getX() < 375)	
		{changeImage = manager.createCommand("changeImage", "DoIt.jpg");}
		
		if (e.getX() > 375 && e.getX() < 475)	
		{changeImage = manager.createCommand("changeImage", "Jack.jpg");}
		
		if (changeImage!=null)
		{
			changeImage.doIt();
			careTaker.addMemento(changeImage);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
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
				System.out.println("Copy");			
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
				System.out.println("Paste");			
			}
		};
	}

	//LORS DE LA RÉCUPÉRATION D'UNE CMD DE CARETAKER & CMDMANAGER, VÉRIFIER QUE C'EST != DE NULL
}
