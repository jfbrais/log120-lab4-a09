package TP4;

import java.awt.image.BufferedImage;
import java.util.Observer;

/**
 * @author CB / TEAM CHJG
 * @version 1.0
 * @created 27-nov.-2009 14:20:25
 */
public class Target
{

	private ModeleZoom mZoom = ModeleZoom.getInstance();
	private ModeleImage mImage = ModeleImage.getInstance();
	private ModelePosition mPosition = ModelePosition.getInstance();

	public String getImage()
	{
		return mImage.getImage();
	}

	public void setImage(String uneImage)
	{
		mImage.setImage(uneImage);
	}

	public int getX()
	{
		return mPosition.getX();
	}

	public int getY()
	{
		return mPosition.getY();
	}

	public int getZoom()
	{
		return mZoom.getZoom();
	}

	public void setX(int leX)
	{
		mPosition.setX(leX);
	}

	public void setY(int leY)
	{
		mPosition.setY(leY);
	}

	public void setZoom(int leZoom)
	{
		mZoom.setZoom(leZoom);
	}

	public void registrerImage(Observer observer)
	{
		mImage.addObserver(observer);
	}
	
	public void registrerPosition(Observer observer)
	{
		mPosition.addObserver(observer);
	}
	
	public void registrerZoom(Observer observer)
	{
		mZoom.addObserver(observer);
	}
}