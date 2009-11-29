package TP4;

import java.io.BufferedReader;
import java.util.ArrayList;

public class ModelePosition 
{
	private static ModelePosition instance = new ModelePosition();
	private ArrayList<Vue> vues;
	int coordX;
	int coordY;
	
	private ModelePosition()
	{
		
	}
	
	public void addVue(Vue uneVue)
	{

	}
	
	public static ModelePosition getInstance()
	{
		return instance;
	}
	
	public void removeVue(Vue uneVue)
	{
		
	}
	
	public int getX()
	{
		return 0;
	}
	
	public int getY()
	{
		return 0;
	}
	
	public void setX(int x)
	{
		
	}
	
	public void setY(int y)
	{
		
	}
}
