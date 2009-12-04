package TP4;

/**
 * Classe enfant de PasteIf. Sert a prendre en copie les attributs de l'image
 *
 */
public class Paste extends PasteIF
{	
	private int 
			coordX = 0,
			coordY = 0,
			zoom = 100;
	private String image = "";
	
	/**
	 * va cherche les données courantes sur l'image et les stocks dans les variable de classe
	 */
	protected Paste()
	{
		super();
		
		coordX = new Target().getX();
		coordY = new Target().getY();
		zoom = new Target().getZoom();
		image = new Target().getImage();
	}

	@Override
	public void pasteIt() 
	{
		new Listeners().createCommand(String.valueOf(coordX), String.valueOf(coordY), String.valueOf(zoom), image);
	}
}
