/******************************************************
 Cours :             LOG120
 Session :           Saison automne 2009
 Groupe :            03
 Projet :            Laboratoire #4
 Étudiant(e)(s) :    Gabriel Desmarais
 					 Jean-François Brais-Villemur
 					 Claude Bouchard
 					 Hugo Bergeron
 Code(s) perm. :     DESG24078908
 					 BRAJ14088901
 					 BOUC12018902
 					 BERH17028709
 Professeur :        Jocelyn Benoît
 Chargé de labo.:    Vincent Carrier
 					 Yanick Rochon
 Nom du fichier :	 ModelePosition.java 					 
 Date créée :        2009-12-10
 Date dern. modif. : 2009-12-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-12-10 : Status Initial
 *******************************************************/

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
		coordY += y;

		setChanged();
		
		notifyObservers("Position");
	}
}
