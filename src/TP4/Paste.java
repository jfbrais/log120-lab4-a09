package TP4;

public class Paste extends PasteIF
{	
	private int 
			coordX = 0,
			coordY = 0,
			zoom = 100;
	private String image = "";
	
	protected Paste()
	{
		super();
		
		coordX = new Target().getX();
		coordY = new Target().getY();
		zoom = new Target().getZoom();
		image = new Target().getImage();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pasteIt() 
	{
		new Listeners().createCommand(String.valueOf(coordX), String.valueOf(coordY), String.valueOf(zoom), image);
	}
}
