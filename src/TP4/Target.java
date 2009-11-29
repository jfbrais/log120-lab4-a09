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

	ModeleZoom mZoom = ModeleZoom.getInstance();
	ModeleImage mImage = ModeleImage.getInstance();
	ModelePosition mPosition = ModelePosition.getInstance();

	public BufferedImage getImage()
	{
		return mImage.getImage();
	}

	public void setImage(BufferedImage uneImage)
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

	public void registrerImage(Vue laVue)
	{
		
	}
	
	public void registrerPosition(Observer laVue)
	{
		mPosition.addObserver(laVue);
	}
	
	public void registrerZoom(Vue laVue)
	{
		
	}
}