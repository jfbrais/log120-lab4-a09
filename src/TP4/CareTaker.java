package TP4;

import java.util.ArrayList;

/**
 * S'occupe de la gestion des commande d'annulation et de r�p�tition
 *
 */
public class CareTaker
{
	/**
	 * Static afin de rendre la classe singleton
	 */
	private static CareTaker instance = new CareTaker();
	private ArrayList<ABSCommand> redo = new ArrayList<ABSCommand>();
	private ArrayList<ABSCommand> undo = new ArrayList<ABSCommand>();
	
	/**
	 * Constructeur priv� afin de rendre la classe singleton
	 */
	private CareTaker()
	{
		
	}
	
	/**
	 * Retroune l'instance unique de Caretaker
	 * @return instance
	 */
	public static CareTaker getInstance()
	{
		return instance;
	}
	
	/**
	 * Cr�e un nouveau Memento et l'ajoute dans le stack
	 * Cr�e aussi une arrayList pour le Redo
	 * 
	 * @param newMemento
	 */
	public void addMemento(ABSCommand newMemento)
	{
		undo.add(newMemento);
		
		redo = new ArrayList<ABSCommand>();
	}
	
	/**
	 * Retourne le dernier memento (ABScommand) disponible dans le stack
	 * si aucune.. retourne null
	 * Change de pile (stack) le undo par la suite
	 * @return
	 */
	public ABSCommand getUndoMemento()
	{
		if (undo.size() > 0)
		{
			redo.add(undo.get(undo.size()-1));
			undo.remove(undo.size()-1);
			return redo.get(redo.size()-1);
		}
		else
			return null;
	}
	
	/**
	 * Retourne le dernier Redo
	 * Change de pile (stack) le redo par la suite
	 * @return
	 */
	public ABSCommand getRedoMemento()
	{
		if (redo.size() > 0)
		{
			undo.add(redo.get(redo.size()-1));
			redo.remove(redo.size()-1);
			return undo.get(undo.size()-1);
		}
		else
			return null;
	}
}
