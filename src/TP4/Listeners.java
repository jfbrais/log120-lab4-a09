package TP4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Listeners implements MouseMotionListener, MouseWheelListener
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
		ABSCommand changeZoom = manager.createCommand("changeZoom", String.valueOf(arg0.getWheelRotation()));
		
		if (changeZoom!=null)
		{
			changeZoom.doIt();
			careTaker.addMemento(changeZoom);
		}
		
	}

	//LORS DE LA R�CUP�RATION D'UNE CMD DE CARETAKER & CMDMANAGER, V�RIFIER QUE C'EST != DE NULL
}
