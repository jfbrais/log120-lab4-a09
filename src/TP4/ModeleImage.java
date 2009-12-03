package TP4;

import java.util.Observable;

/**
 * Modele contenant les info sur l'image
 * c'est une classe singleton
 * 
 * NE CONTIENT PAS les infos de zoom et de position
 *
 */
public class ModeleImage extends Observable 
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
