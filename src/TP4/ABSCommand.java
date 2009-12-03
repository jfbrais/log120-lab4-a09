package TP4;

/**
 * Contient deux rôles de base 
 * Faire et défaire une commande.
 *
 */
public abstract class ABSCommand
{
	/**
	 * Détermine les modification a faire 
	 * pour exécuter une comande
	 */
	public abstract void doIt();
	
	/**
	 * Détermine les modifications à faire 
	 * pour annuler une commande.
	 */
	public abstract void undoIt();
}
