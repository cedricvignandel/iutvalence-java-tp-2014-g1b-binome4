package fr.iutvalence.java.tp.tilepuzzle;

/**
 * Définit un plateau de jeu, il contient un certain de cases réparties dans un
 * carré.
 */
public class Plateau
{
	/**
	 * Largeur par défaut d'un plateau
	 */
	private static final int LARGEUR_DEFAUT = 3;
	
	/**
	 * Largeur du plateau
	 */
	private final int largeur;
	
	// TODO réfléchir aux valeurs que peuvent prendre les cases du tableau (constantes)
	/**
	 * Tableau des cases du plateau
	 */
	private int[][] cases;

	/**
	 * Crée un nouveau plateau de largeur par défaut, avec toutes les cases
	 * éteintes.
	 */
	public Plateau()
	{
		this.largeur = LARGEUR_DEFAUT;
		this.cases = new int[this.largeur][this.largeur];
		for (int colonne = 0; colonne < this.cases.length; colonne++)
		{
			for (int ligne = 0; ligne < this.cases[colonne].length; ligne++)
			{
				// TODO définir 0 comme une constante
				this.cases[colonne][ligne] = 0;
			}
		}
	}
}
