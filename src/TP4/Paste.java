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
 Nom du fichier :	 Paste.java 					 
 Date créée :        2009-12-10
 Date dern. modif. : 2009-12-10
 
 *******************************************************
 Historique des modifications
 *******************************************************
 2009-12-10 : Status Initial
 *******************************************************/

package TP4;

/**
 * Classe enfant de PasteIf. Sert a prendre en copie les attributs de l'image
 *
 */
public class Paste extends PasteIF
{	
	private int 
			coordX = 0,
			coordY = 0,
			zoom = 100;
	private String image = "";
	
	/**
	 * va cherche les données courantes sur l'image et les stocks dans les variable de classe
	 */
	protected Paste()
	{
		super();
		
		coordX = new Target().getX();
		coordY = new Target().getY();
		zoom = new Target().getZoom();
		image = new Target().getImage();
	}

	@Override
	public void pasteIt() 
	{
		new Listeners().createCommand(String.valueOf(coordX), String.valueOf(coordY), String.valueOf(zoom), image);
	}
}
