package TP4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueDonnees extends JPanel implements Observer
{
	Rectangle bounds = new Rectangle(0, 420, 150, 80);
	int posX=0,posY=0,zoom=100;
	String image = "";
	
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
