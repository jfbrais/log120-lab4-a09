package TP4;

import java.io.Serializable;
import java.util.Observable;

/**
  * Modele contenant les info sur la position de l'image
 * c'est une classe singleton
 * 
 */
public class ModelePosition extends Observable implements Serializable
{
	/**
	 *  instance Static afin de rendre la classe singleton
	 */
	private static ModelePosition instance = new ModelePosition();
	private int coordX = 0;
	private int coordY = 0;
	
	/**
	 * Private afin de rendre la classe singleton
	 */
	private ModelePosition()
	{}
	
	/**
	 * Retourne l'instance unique du modele ( singleton )
	 * @return
	 */
	public static ModelePosition getInstance()
	{
		return instance;
	}
	
	/**
	 * Retourne la coordonée en X du modele
	 * @return
	 */
	public int getX()
	{
		return coordX;
	}
	
	/**
	 *Retourne la coordonée en X du modele
	 * @return
	 */
	public int getY()
	{
		return coordY;
	}
	
	/**
	 * Permet de changer la coordonée en X contenu dans le modele
	 * @param x
	 */
	public void setX(int x)
	{
		coordX += x;
		setChanged();
		
		notifyObservers("Position");
	}
	
	/**
	 * Permet de changer la coordonée en X contenu dans le modele
	 * @param y
	 */
	public void setY(int y)
	{
//		if (coordY + y < 500 && coordY + y > -500)
			coordY += y;
//		else if (coordY + y > 500)
//			coordY = -500+y;
//		else
//			coordY = 500-y;
		
		setChanged();
		
		notifyObservers("Position");
	}
}
