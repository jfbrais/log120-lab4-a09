package TP4;

import java.util.Observable;

/**
 * @author CB / TEAM CHJG
 * @version 1.0
 * @created 27-nov.-2009 14:26:27
 */
public class ModeleZoom extends Observable
{
	private static ModeleZoom instance = new ModeleZoom();
	private int zoom;

	private ModeleZoom()
	{

	}

	public static ModeleZoom getInstance()
	{
		return instance;
	}

	public int getZoom()
	{
		return zoom;
	}

	public void setZoom(int unZoom)
	{
		zoom = unZoom;
		
		setChanged();
		
		notifyObservers("Zoom");
	}

}