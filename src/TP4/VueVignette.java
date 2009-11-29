package TP4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueVignette extends JPanel implements Observer
{
	Rectangle bounds = new Rectangle(0, 0, 80, 400);
	public VueVignette()
	{
		this.setBackground(Color.GREEN);
		this.setBounds(bounds);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		this.setBounds(bounds); 
	} 
	//ImageIcon thumbnailIcon = new ImageIcon(getScaledImage(icon.getImage(), 32, 32));

	@Override
	public void update(Observable arg0, Object arg1)
	{
		// TODO Auto-generated method stub
		
	}
}
