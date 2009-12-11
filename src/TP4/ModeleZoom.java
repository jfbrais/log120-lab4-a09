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
 Nom du fichier :	 ModeleZoom.java 					 
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
 * 
 * Modele contenant les info sur la force de zoom appliqué a l'image
 * c'est une classe singleton
 * 
 */
/**
 * @author Claude Bouchard
 *
 */
public class ModeleZoom extends Observable implements Serializable
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