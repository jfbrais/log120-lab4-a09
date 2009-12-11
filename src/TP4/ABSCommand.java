/******************************************************
 Cours :             LOG120
 Session :           Saison automne 2009
 Groupe :            03
 Projet :            Laboratoire #3
 Étudiant(e)(s) :    Gabriel Desmarais
 					 Jean-François Brais-Villemur
 Code(s) perm. :     DESG24078908
 					 BRAJ14088901
 Professeur :        Jocelyn Benoît
 Chargé de labo.:    Vincent Carrier
 					 Yanick Rochon
 Nom du fichier :	 Carte.java 					 
 Date créée :        2009-11-10
 Date dern. modif. : 2009-11-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-11-10 : Status Initial
 *******************************************************/

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
