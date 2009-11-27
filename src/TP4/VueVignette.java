package TP4;

import java.awt.Color;

import javax.swing.JPanel;

public class VueVignette extends JPanel implements Vue
{
	public VueVignette()
	{
		this.setBackground(Color.GREEN);
		this.setBounds(0, 0, 80, 400);
	}
	
	@Override
	public void update() 
	{
		
	}

}
