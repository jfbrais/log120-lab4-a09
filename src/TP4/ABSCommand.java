/******************************************************
 Cours :             LOG120
 Session :           Saison automne 2009
 Groupe :            03
 Projet :            Laboratoire #4
 �tudiant(e)(s) :    Gabriel Desmarais
 					 Jean-Fran�ois Brais-Villemur
 					 Claude Bouchard
 					 Hugo Bergeron
 Code(s) perm. :     DESG24078908
 					 BRAJ14088901
 					 BOUC12018902
 					 BERH17028709
 Professeur :        Jocelyn Beno�t
 Charg� de labo.:    Vincent Carrier
 					 Yanick Rochon
 Nom du fichier :	 ABSCommand.java 					 
 Date cr��e :        2009-12-10
 Date dern. modif. : 2009-12-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-12-10 : Status Initial
 *******************************************************/

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
