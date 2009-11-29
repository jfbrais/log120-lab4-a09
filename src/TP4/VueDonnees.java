package TP4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class VueDonnees extends JPanel implements Observer
{
	Rectangle bounds = new Rectangle(80, 420, 420, 80);
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
	public void update(Observable arg0, Object arg1)
	{
		// TODO Auto-generated method stub
		
	}
}
