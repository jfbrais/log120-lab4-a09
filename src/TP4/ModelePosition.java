package TP4;

import java.util.ArrayList;
import java.util.Observable;

public class ModelePosition extends Observable
{
	private static ModelePosition instance = new ModelePosition();
	private ArrayList<Vue> vues = new ArrayList<Vue>();
	private int coordX = 0;
	private int coordY = 0;
	
	private ModelePosition()
	{
		
	}
	
	public void addVue(Vue uneVue)
	{
		vues.add(uneVue);
	}
	
	public static ModelePosition getInstance()
	{
		return instance;
	}
	
	public void removeVue(Vue uneVue)
	{
		if (vues.indexOf(uneVue)!=-1)
		{
			vues.remove(vues.indexOf(uneVue));
		}
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
		
		for (Vue node : vues)
		{node.update();}
	}
	
	public void setY(int y)
	{
		coordY = y;
		
		for (Vue node : vues)
		{node.update();}
	}
}
