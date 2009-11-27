package TP4;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Observable;

public class ModeleImage extends Observable 
{
	private static ModeleImage instance = new ModeleImage();
	private ArrayList<Vue> lavues;
	private BufferedReader image;
	
	private ModeleImage()
	{
		
	}
	
	public void addVue(Vue uneVue)
	{

	}
	
	public BufferedReader getImage()
	{
		return image;
	}
	
	public static ModeleImage getInstance()
	{
		return instance;
	}
	
	public void removeVue(Vue uneVue)
	{
		
	}
	
	public void setImage(BufferedReader uneImage)
	{
		
	}
}
