package TP4;

import java.util.Observable;

public class ModelePosition extends Observable
{
	private static ModelePosition instance = new ModelePosition();
	private int coordX = 0;
	private int coordY = 0;
	
	private ModelePosition()
	{}
	
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
//		if (coordX + x < 500 && coordX + x > -500)
			coordX += x;
//		else if (coordX + x > 500)
//			coordX = -500+x;
//		else
//			coordX = 500-x;
		
		setChanged();
		
		notifyObservers("Position");
	}
	
	public void setY(int y)
	{
//		if (coordY + y < 500 && coordY + y > -500)
			coordY += y;
//		else if (coordY + y > 500)
//			coordY = -500+y;
//		else
//			coordY = 500-y;
		
		setChanged();
		
		notifyObservers("Position");
	}
}
