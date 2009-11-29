package TP4;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author CB / TEAM CHJG
 * @version 1.0
 * @created 27-nov.-2009 14:26:27
 */
public class ModeleZoom extends Observable
{

	private static ModeleZoom instance = new ModeleZoom();
	private ArrayList<Vue> vues;
	private int zoom;

	private ModeleZoom()
	{

	}

	public void addVue(Vue uneVue)
	{
		vues.add(uneVue);
	}

	public static ModeleZoom getInstance()
	{
		return instance;
	}

	public int getZoom()
	{
		return zoom;
	}

	public void removeVue(Vue uneVue)
	{
		if (vues.indexOf(uneVue)!=-1)
		{
			vues.remove(vues.indexOf(uneVue));
		}
	}

	public void setZoom(int unZoom)
	{
		zoom = unZoom;
		
		for (Vue node : vues)
		{node.notify();}
	}

}