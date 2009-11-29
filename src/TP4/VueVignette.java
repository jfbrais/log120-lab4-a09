package TP4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueVignette extends JPanel implements Observer
{
	Rectangle bounds = new Rectangle(150, 420, 350, 80);
	String image = "";
	int posX=0,posY=0,zoom=0;
	
	public VueVignette()
	{
		this.setBackground(Color.DARK_GRAY);
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
		JLabel label = new JLabel(new ImageIcon(getClass().getResource(image)));
		label.setBounds(150,420,80,80);
		this.add(label); 
	} 
	//ImageIcon thumbnailIcon = new ImageIcon(getScaledImage(icon.getImage(), 32, 32));

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
