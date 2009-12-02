package TP4;

public abstract class PasteIF 
{
	private static PasteIF instance = new PasteNull();

	protected PasteIF()
	{}
	
	public static PasteIF getInstance()
	{
		return instance;
	}
	
	public void copy()
	{
		instance = new Paste();
	}
	
	/**
	 * 
	 */
	public abstract void pasteIt();
}
