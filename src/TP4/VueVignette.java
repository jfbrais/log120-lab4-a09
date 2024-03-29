/******************************************************
 Cours :             LOG120
 Session :           Saison automne 2009
 Groupe :            03
 Projet :            Laboratoire #4
 �tudiant(e)(s) :    Gabriel Desmarais
 					 Jean-Fran�ois Brais-Villemur
 					 Claude Bouchard
 					 Hugo Bergeron
 Code(s) perm. :     DESG24078908
 					 BRAJ14088901
 					 BOUC12018902
 					 BERH17028709
 Professeur :        Jocelyn Beno�t
 Charg� de labo.:    Vincent Carrier
 					 Yanick Rochon
 Nom du fichier :	 VueVignette.java 					 
 Date cr��e :        2009-12-10
 Date dern. modif. : 2009-12-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-12-10 : Status Initial
 *******************************************************/

package TP4;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Affiche l'image en format r�duit et qui ne bouge pas
 *
 */
public class VueVignette extends JPanel implements Observer
{
	private Rectangle bounds = new Rectangle(150, 420, 350, 80);
	private String image = "";
	private int posX=0,posY=0,zoom=100;
	
	/**
	 * Constructeur.. enregistre un mousse listener
	 */
	public VueVignette()
	{
		this.setBackground(Color.DARK_GRAY);
		this.setBounds(bounds);
		
		this.addMouseListener(new Listeners());
		
		this.setLayout(null);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		this.removeAll();
		this.setLayout(null);
		
		ImageIcon icon = new ImageIcon(getClass().getResource("TICSH.jpg"));
		ImageIcon thumbnailIcon = new ImageIcon(createResizedCopy(icon.getImage(), 100, 80,false));
		JLabel label = new JLabel(thumbnailIcon);
		label.setBounds(175,420,100,80);
		this.add(label); 
		
		ImageIcon icon2 = new ImageIcon(getClass().getResource("DoIt.jpg"));
		ImageIcon thumbnailIcon2 = new ImageIcon(createResizedCopy(icon2.getImage(), 100, 80,false));
		JLabel label2 = new JLabel(thumbnailIcon2);
		label2.setBounds(275,420,100,80);
		this.add(label2); 
		
		ImageIcon icon3 = new ImageIcon(getClass().getResource("Jack.jpg"));
		ImageIcon thumbnailIcon3 = new ImageIcon(createResizedCopy(icon3.getImage(), 100, 80,false));
		JLabel label3 = new JLabel(thumbnailIcon3);
		label3.setBounds(375,420,100,80);
		this.add(label3);
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
	
	//La m�thode suivante a �t� fournie par Sun et est r�f�renc�e sur le site web suivant : 
	//http://java.sun.com/products/java-media/2D/reference/faqs/index.html#Q_How_do_I_create_a_resized_copy
	/**
	 * 
	 * Cr�er une version minitaturis� de l'image en cours d'affichage
	 * 
	 * @param originalImage
	 * @param scaledWidth
	 * @param scaledHeight
	 * @param preserveAlpha
	 * @return
	 */
	BufferedImage createResizedCopy(Image originalImage, int scaledWidth, int scaledHeight, boolean preserveAlpha)
	{
		int imageType = preserveAlpha ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
		
		BufferedImage scaledBI = new BufferedImage(scaledWidth, scaledHeight, imageType);
		Graphics2D g = scaledBI.createGraphics();
		
		if (preserveAlpha) 
		{g.setComposite(AlphaComposite.Src);}
		
		g.drawImage(originalImage, 0, 0, scaledWidth, scaledHeight, null); 
		g.dispose();
		return scaledBI;
	}
}
