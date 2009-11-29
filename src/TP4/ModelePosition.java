package TP4;

import java.util.Observable;

public class ModelePosition extends Observable
{
	private static ModelePosition instance = new ModelePosition();
	private int coordX = 0;
	private int coordY = 0;
	
	private ModelePosition()
	{
		
	}
	
	public static ModelePosition getInstance()
	{
		return instance;
	}
	
	public int getX()
	{
		return coordX;
	}
	
	public int getY()
	{
		return coordY;
	}
	
	public void setX(int x)
	{
		coordX = x;
		
		setChanged();
		
		notifyObservers("Position");
	}
	
	public void setY(int y)
	{
		coordY = y;
		
		setChanged();
		
		notifyObservers("Position");
	}
}
