package TP4;

import java.awt.image.BufferedImage;
import java.util.Observer;

/**
 * Gere les acces aux différents modèles
 */
public class Target
{

	private ModeleZoom mZoom = ModeleZoom.getInstance();
	private ModeleImage mImage = ModeleImage.getInstance();
	private ModelePosition mPosition = ModelePosition.getInstance();

	/**
	 * retourne l'image contenu dans le modele image
	 * @return
	 */
	public String getImage()
	{
		return mImage.getImage();
	}

	/**
	 * modifie l'image contenu dans le modele image
	 * @param uneImage
	 */
	public void setImage(String uneImage)
	{
		mImage.setImage(uneImage);
	}

	/**
	 *  retourne la position en x contenu dans le modele position
	 * @return
	 */
	public int getX()
	{
		return mPosition.getX();
	}

	/**
	 * retourne la position en Y contenu dans le modele position
	 * @return
	 */
	public int getY()
	{
		return mPosition.getY();
	}

	/**
	 * retourne le niveau de zoom contenu dans le modele zoom
	 * @return
	 */
	public int getZoom()
	{
		return mZoom.getZoom();
	}

	/**
	 *  modifie la position en x contenu dans le modele position
	 * @param leX
	 */
	public void setX(int leX)
	{
		mPosition.setX(leX);
	}

	/**
	 *  modifie la position en Y contenu dans le modele position
	 * @param leY
	 */
	public void setY(int leY)
	{
		mPosition.setY(leY);
	}

	/**
	 *  modifie le niveau de zoom contenu dans le modele zoom
	 * @param leZoom
	 */
	public void setZoom(int leZoom)
	{
		mZoom.setZoom(leZoom);
	}

	/**
	 * ajoute un observer au modele image
	 * @param observer
	 */
	public void registrerImage(Observer observer)
	{
		mImage.addObserver(observer);
	}
	
	/**
	 *ajoute un observer au modele position
	 * @param observer
	 */
	public void registrerPosition(Observer observer)
	{
		mPosition.addObserver(observer);
	}
	
	/**
	 * ajoute un observer au modele zoom
	 * @param observer
	 */
	public void registrerZoom(Observer observer)
	{
		mZoom.addObserver(observer);
	}
}