package TP4;

import java.util.Observable;

/**
 * 
 * Modele contenant les info sur la force de zoom appliqué a l'image
 * c'est une classe singleton
 * 
 */
/**
 * @author Claude Bouchard
 *
 */
/**
 * @author Claude Bouchard
 *
 */
public class ModeleZoom extends Observable
{
	/**
	 *   instance Static afin de rendre la classe singleton
	 */
	private static ModeleZoom instance = new ModeleZoom();
	private int zoom = 100;

	/**
	 *Private afin de rendre la classe singleton
	 */
	private ModeleZoom()
	{}

	/**
	 * Retourne l'instance unique du modele ( singleton )
	 * @return instance
	 */
	public static ModeleZoom getInstance()
	{
		return instance;
	}

	/**
	 * Retourne le niveau de zoom contenu dans le modele
	 * @return
	 */
	public int getZoom()
	{
		return zoom;
	}

	/**
	 * Permet de modifier le niveau de zoom contenu dans le modele
	 * @param unZoom
	 */
	public void setZoom(int unZoom)
	{
		if (zoom+unZoom < 1 || zoom+unZoom > 500)
			return;
		
		zoom += unZoom;
		
		setChanged();
		
		notifyObservers("Zoom");
	}

}