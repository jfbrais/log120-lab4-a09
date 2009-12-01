package TP4;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueImage extends JPanel implements Observer
{
	String image = "";
	Rectangle bounds = new Rectangle(0, 0, 500, 420);
	int posX=0,
		posY=0,
		zoom=100;
	
	public VueImage()
	{
		this.setBackground(Color.BLACK);
		this.setBounds(bounds);
		
		this.addMouseMotionListener(new Listeners());
		this.addMouseWheelListener(new Listeners());
		
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
		
		ImageIcon icon = new ImageIcon(getClass().getResource(image));
		ImageIcon imageIcon = new ImageIcon(createResizedCopy(icon.getImage(), 500*zoom/100, 420*zoom/100,false));
		JLabel label = new JLabel(imageIcon);
		label.setBounds(posX,posY,500,420);
		this.add(label); 
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

	//http://java.sun.com/products/java-media/2D/reference/faqs/index.html#Q_How_do_I_create_a_resized_copy
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
