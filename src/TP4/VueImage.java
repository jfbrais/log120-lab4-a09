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
	Rectangle bounds = new Rectangle(80, 0, 420, 500);
	int posX=0,posY=0,zoom=0;
	
	public VueImage()
	{
		this.setBackground(Color.BLACK);
		this.setBounds(bounds);
		
		this.addMouseMotionListener(new Listeners());
		
		new Target().registrerPosition(this);
		this.setLayout(null);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		this.removeAll();
		JLabel label = new JLabel(image);
		label.setBounds(posX,posY,420,500);
		this.add(label); 
	} 
	
	@Override
	public void update(Observable arg0, Object arg1)
	{
		posX = new Target().getX();
		posY = new Target().getY();
		zoom = new Target().getZoom();
		repaint();
	}

}
