package TP4;

import java.awt.Color;
import javax.swing.JPanel;

public class VueDonnees extends JPanel implements Vue
{
	public VueDonnees()
	{
		this.setBackground(Color.RED);
		this.setBounds(0, 400, 80, 100);
		
		this.addMouseMotionListener(new Listeners());
	}
	
	@Override
	public void update() 
	{
		
	}
	
	
}
