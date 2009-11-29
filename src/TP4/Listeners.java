package TP4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Listeners implements MouseMotionListener
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

	//LORS DE LA RÉCUPÉRATION D'UNE CMD DE CARETAKER & CMDMANAGER, VÉRIFIER QUE C'EST != DE NULL
}
