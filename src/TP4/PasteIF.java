package TP4;

public abstract class PasteIF 
{
	private int coordX,
				coordY,
				zoom;
	private PasteIF instance = null;
	
	/**
	 * @return
	 */
	public PasteIF getInstance()
	{
		return instance;
	}
	
	/**
	 * @param sCopy
	 */
	public void copy(String sCopy)
	{
		
	}
	
	/**
	 * 
	 */
	public abstract void pasteIt();
}
