package TP4;

import java.awt.Color;
import javax.swing.JPanel;

public class VueImage extends JPanel implements Vue
{
	public VueImage()
	{
		this.setBackground(Color.BLUE);
		this.setBounds(80, 0, 420, 500);
	}
	
	@Override
	public void update() 
	{
		
	}

}
