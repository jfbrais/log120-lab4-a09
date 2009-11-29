package TP4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class VueDonnees extends JPanel implements Vue
{
	Rectangle bounds = new Rectangle(0, 400, 80, 100);
	public VueDonnees()
	{
		this.setBackground(Color.RED);
		this.setBounds(0, 400, 80, 100);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		this.setBounds(bounds); 
	} 
	
	@Override
	public void update() 
	{
		
	}
	
	
}
