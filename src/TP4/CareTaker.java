package TP4;

import java.util.ArrayList;

public class CareTaker
{
	ArrayList<MementoImageIF> redo = new ArrayList<MementoImageIF>();
	ArrayList<MementoImageIF> undo = new ArrayList<MementoImageIF>();
	
	public void addMemento(MementoImageIF newMemento)
	{
		undo.add(newMemento);
	}
	
	public void restoreMemento()
	{
		
	}
}
