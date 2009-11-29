package TP4;

import java.util.ArrayList;

public class CareTaker
{
	private static CareTaker instance = new CareTaker();
	ArrayList<ABSCommand> redo = new ArrayList<ABSCommand>();
	ArrayList<ABSCommand> undo = new ArrayList<ABSCommand>();
	
	private CareTaker()
	{
		
	}
	
	public static CareTaker getInstance()
	{
		return instance;
	}
	
	public void addMemento(ABSCommand newMemento)
	{
		undo.add(newMemento);
		
		for (ABSCommand stack : redo)
		{redo.remove(stack);}
	}
	
	public ABSCommand restoreMemento()
	{
		if (undo.size() > 1)
		{
			redo.add(undo.get(undo.size()-1));
			undo.remove(undo.size()-1);
			return redo.get(redo.size()-1);
		}
		else
			return null;
	}
}
