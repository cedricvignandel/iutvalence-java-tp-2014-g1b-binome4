package fr.iutvalence.java.tp.tilepuzzle;


// TODO écrire un commentaire plus précis
/**
 * Classe principale du jeu
 */
public class TilePuzzle
{

	// TODO écrire un commentaire plus concis
	/**
	 * Plateau de cette partie
	 */
	private Plateau plateau;
	
	// TODO écrire un commentaire plus concis
	/**
	 * Joueur de cette partie
	 */
	private Joueur joueur;
	
	// TODO écrire un commentaire plus précis (plateau)
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
