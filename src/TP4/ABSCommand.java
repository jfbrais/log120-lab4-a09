package TP4;

public abstract class ABSCommand implements MementoImageIF
{
	public abstract void doIt();
	public abstract void undoIt();
}
