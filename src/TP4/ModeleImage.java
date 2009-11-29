package TP4;

import java.util.Observable;

public class ModeleImage extends Observable 
{
	private static ModeleImage instance = new ModeleImage();
	private String image;
	
	private ModeleImage()
	{
		
	}
	
	public String getImage()
	{
		return image;
	}
	
	public static ModeleImage getInstance()
	{
		return instance;
	}
	
	public void setImage(String uneImage)
	{
		image = uneImage;
		
		setChanged();
		
		notifyObservers("Image");
	}
}
