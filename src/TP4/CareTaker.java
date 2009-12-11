
/******************************************************
 Cours :             LOG120
 Session :           Saison automne 2009
 Groupe :            03
 Projet :            Laboratoire #4
 Étudiant(e)(s) :    Gabriel Desmarais
 					 Jean-François Brais-Villemur
 					 Claude Bouchard
 					 Hugo Bergeron
 Code(s) perm. :     DESG24078908
 					 BRAJ14088901
 					 BOUC12018902
 					 BERH17028709
 Professeur :        Jocelyn Benoît
 Chargé de labo.:    Vincent Carrier
 					 Yanick Rochon
 Nom du fichier :	 CareTaker.java 					 
 Date créée :        2009-12-10
 Date dern. modif. : 2009-12-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-12-10 : Status Initial
 *******************************************************/
package TP4;

import java.util.ArrayList;

/**
 * S'occupe de la gestion des commande d'annulation et de répétition
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
	 * Constructeur privé afin de rendre la classe singleton
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
	 * Crée un nouveau Memento et l'ajoute dans le stack
	 * Crée aussi une arrayList pour le Redo
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
