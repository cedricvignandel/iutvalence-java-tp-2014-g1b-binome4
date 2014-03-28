package fr.iutvalence.java.tp.tilepuzzle;

// TODO(fait) écrire un commentaire plus précis
/**
 * Classe principale du jeu, initialise la partie en créant un plateau et un joueur.
 */
public class TilePuzzle
{

	/**
	 * Plateau
	 */
	private Plateau plateau;
	
	/**
	 * Joueur
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
		while (this.plateau.getCasesAllumees() < this.plateau.getLargeur()*this.plateau.getLargeur())
		{
			System.out.println(this.plateau.toString());
			this.plateau.inverserCasesAutourDe(this.joueur.getPosition(this.plateau.getHauteur(),this.plateau.getLargeur()));
		}
	}
}
