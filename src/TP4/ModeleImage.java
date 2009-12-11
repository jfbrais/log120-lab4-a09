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
 Nom du fichier :	 ModeleImage.java 					 
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
 * Modele contenant les info sur l'image
 * c'est une classe singleton
 * 
 * NE CONTIENT PAS les infos de zoom et de position
 *
 */
public class ModeleImage extends Observable implements Serializable
{
	/**
	 *  instance Static afin de rendre la classe singleton
	 */
	private static ModeleImage instance = new ModeleImage();
	private String image ="";
	
	/**
	 * Private afin de rendre la classe singleton
	 */
	private ModeleImage()
	{}
	
	/**
	 * retourne l'image contenu dans le modele
	 * 
	 * @return image
	 */
	public String getImage()
	{
		return image;
	}
	
	/**
	 * Retourne l'instance unique du modele ( singleton )
	 * @return instance
	 */
	public static ModeleImage getInstance()
	{
		return instance;
	}
	
	/**
	 * Permet de changer l'image contenu dans le modele
	 * 
	 * @param uneImage
	 */
	public void setImage(String uneImage)
	{
		image = uneImage;
		
		setChanged();
		
		notifyObservers("Image");
	}
}
