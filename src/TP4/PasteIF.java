package TP4;

public abstract class PasteIF 
{
	private static PasteIF instance = new PasteNull();

	protected PasteIF()
	{}
	
	/**
	 * retourne l'instance unique en cours
	 * @return instance
	 */
	public static PasteIF getInstance()
	{
		return instance;
	}
	
	/**
	 *  assigne un new paste dans l'instance unique de PasteIf
	 */
	public void copy()
	{
		instance = new Paste();
	}
	
	/**
	 * se charge de coller
	 */
	public abstract void pasteIt();
}
