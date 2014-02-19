package fr.iutvalence.java.tp.tilepuzzle;

/**
 * Classe principale du jeu
 */
public class TilePuzzle
{
	/**
	 * Plateau de cette partie
	 */
	private Plateau plateau;
	/**
	 * Joueur de cette partie
	 */
	private Joueur joueur;
	
	/**
	 * Crée une partie prête à être jouée.
	 * Cela implique la mise en place d'un plateau et d'un joueur pour cette partie.
	 */
	public TilePuzzle()
	{
		this.plateau = new Plateau();
		this.joueur = new Joueur();
	}

	/**
	 * Lance la partie
	 */
	public void jouer()
	{
		
	}
}
