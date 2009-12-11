
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
 Nom du fichier :	 VueDonnees.java 					 
 Date créée :        2009-12-10
 Date dern. modif. : 2009-12-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-12-10 : Status Initial
 *******************************************************/
package TP4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Affiche les donnes sur l'état du zoom et la position de l'image
 *
 */
public class VueDonnees extends JPanel implements Observer
{
	private Rectangle bounds = new Rectangle(0, 420, 150, 80);
	private int posX=0,posY=0,zoom=100;
	private String image = "";
	
	/**
	 * S'enregistre aupres d'une target
	 */
	public VueDonnees()
	{
		this.setBackground(Color.LIGHT_GRAY);
		this.setBounds(bounds);
		
		new Target().registrerPosition(this);
		new Target().registrerZoom(this);
		new Target().registrerImage(this);
		
		this.setLayout(null);
	}
	

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		this.removeAll();
		this.setLayout(null);
		
		JLabel labelX = new JLabel("X : "+String.valueOf(posX));
		labelX.setBounds(10,5,100,15);
		this.add(labelX); 
		
		JLabel labelY = new JLabel("Y : "+String.valueOf(posY));
		labelY.setBounds(10,20,100,15);
		this.add(labelY); 
		
		JLabel labelZ = new JLabel("Zoom : "+String.valueOf(zoom));
		labelZ.setBounds(10,45,100,15);
		this.add(labelZ); 
		
		JLabel labelI = new JLabel("Image : "+image);
		labelI.setBounds(10,60,100,15);
		this.add(labelI); 
	} 

	@Override
	public void update(Observable arg0, Object arg1)
	{
		if (arg1.equals("Position"))
		{
			posX = new Target().getX();
			posY = new Target().getY();
		}
		
		if (arg1.equals("Zoom"))
			zoom = new Target().getZoom();
			
		if (arg1.equals("Image"))
			image = new Target().getImage();
		
		repaint();
	}
}
