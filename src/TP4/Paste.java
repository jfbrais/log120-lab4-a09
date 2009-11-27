package TP4;

public abstract class Paste 
{
	private int coordX,
				coordY,
				zoom;
	private Paste instance = null;
	
	/**
	 * @return
	 */
	public Paste getInstance()
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
