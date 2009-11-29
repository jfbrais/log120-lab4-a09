package TP4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueImage extends JPanel implements Observer
{
	ImageIcon image = new ImageIcon(getClass().getResource("TICSH.jpg"));
	Rectangle bounds = new Rectangle(0, 0, 500, 420);
	int posX=0,posY=0,zoom=0;
	
	public VueImage()
	{
		this.setBackground(Color.BLACK);
		this.setBounds(bounds);
		
		this.addMouseMotionListener(new Listeners());
		
		new Target().registrerPosition(this);
		new Target().registrerZoom(this);
		new Target().registrerImage(this);
		this.setLayout(null);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		this.removeAll();
		JLabel label = new JLabel(image);
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
			image = new ImageIcon(getClass().getResource(new Target().getImage()));
		
		repaint();
	}

}
