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
 Nom du fichier :	 PasteIF.java 					 
 Date cr��e :        2009-12-10
 Date dern. modif. : 2009-12-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-12-10 : Status Initial
 *******************************************************/

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
