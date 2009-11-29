package TP4;

import java.util.ArrayList;

public class CareTaker
{
	ArrayList<MementoImageIF> redo = new ArrayList<MementoImageIF>();
	ArrayList<MementoImageIF> undo = new ArrayList<MementoImageIF>();
	
	public void addMemento(MementoImageIF newMemento)
	{
		undo.add(newMemento);
		
		for (MementoImageIF stack : redo)
		{redo.remove(stack);}
	}
	
	public MementoImageIF restoreMemento()
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
