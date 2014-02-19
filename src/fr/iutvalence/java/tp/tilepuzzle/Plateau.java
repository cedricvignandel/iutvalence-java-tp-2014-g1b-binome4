package fr.iutvalence.java.tp.tilepuzzle;


/**
 * Définit un plateau de jeu, il contient un certain de cases réparties dans
 * un carré.
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
	/**
	 * Tableau des cases du plateau
	 */
	private int[][] cases;
	
	/**
	 * Crée un nouveau plateau de largeur par défaut.
	 */
	public Plateau()
	{
		this.largeur = LARGEUR_DEFAUT;
		this.cases = new int[this.largeur][this.largeur];
		
	}
}
