package TP4;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author CB / TEAM CHJG
 * @version 1.0
 * @created 27-nov.-2009 14:26:27
 */
public class ModeleZoom extends Observable {

	private static ModeleZoom instance = new ModeleZoom();
	private ArrayList<Vue> vues;
	private int zoom;

	private ModeleZoom()
	{

	}

	/**
	 * 
	 * @param 1
	 */
	public void addVue(Vue uneVue)
	{

	}

	public static ModeleZoom getInstance()
	{
		return instance;
	}

	public int getZoom()
	{
		return 0;
	}

	/**
	 * 
	 * @param 1
	 */
	public void removeVue(Vue uneVue)
	{

	}

	/**
	 * 
	 * @param 1
	 */
	public void setZoom(int unZoom){

	}

}