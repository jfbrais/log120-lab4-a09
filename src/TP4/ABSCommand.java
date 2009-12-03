package TP4;

/**
 * Contient deux r�les de base 
 * Faire et d�faire une commande.
 *
 */
public abstract class ABSCommand
{
	/**
	 * D�termine les modification a faire 
	 * pour ex�cuter une comande
	 */
	public abstract void doIt();
	
	/**
	 * D�termine les modifications � faire 
	 * pour annuler une commande.
	 */
	public abstract void undoIt();
}
