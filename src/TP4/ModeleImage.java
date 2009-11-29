package TP4;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Observable;

public class ModeleImage extends Observable 
{
	private static ModeleImage instance = new ModeleImage();
	private BufferedImage image;
	
	private ModeleImage()
	{
		
	}
	
	public BufferedImage getImage()
	{
		return image;
	}
	
	public static ModeleImage getInstance()
	{
		return instance;
	}
	
	public void setImage(BufferedImage uneImage)
	{
		image = uneImage;
		
		setChanged();
		
		notifyObservers();
	}
}
