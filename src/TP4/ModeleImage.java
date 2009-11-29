package TP4;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Observable;

public class ModeleImage extends Observable 
{
	private static ModeleImage instance = new ModeleImage();
	private ArrayList<Vue> vues;
	private BufferedImage image;
	
	private ModeleImage()
	{
		
	}
	
	public void addVue(Vue uneVue)
	{
		vues.add(uneVue);
	}
	
	public BufferedImage getImage()
	{
		return image;
	}
	
	public static ModeleImage getInstance()
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
	
	public void setImage(BufferedImage uneImage)
	{
		image = uneImage;
		
		for (Vue node : vues)
		{node.notify();}
	}
}
