package fr.iutvalence.java.tp.tilepuzzle;

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
	 * Support d'affichage
	 */
	private Affichage affichage;
	
	/**
	 * Crée une partie prête à être jouée.
	 * Cela implique la mise en place d'un plateau et d'un joueur pour cette partie.
	 * @param fdp Fabrique de plateau utilisée pour la partie
	 * @param affichage Affichage a utiliser
	 */
	public TilePuzzle(FabriqueDePlateau fdp, Affichage affichage)
	{
		this.plateau = fdp.obtenirPlateauDefini(3, 3, 10);
		this.joueur = new JoueurClavier();
		this.affichage = affichage;
	}

	/**
	 * Lance la partie
	 */
	public void jouer()
	{
		this.affichage.afficherPlateau(this.plateau);
		while (this.plateau.getCasesAllumees() < this.plateau.getHauteur()*this.plateau.getLargeur())
		{
			this.plateau.inverserCasesAutourDe(this.joueur.getPosition(this.plateau.getHauteur(),this.plateau.getLargeur()));
			this.affichage.afficherPlateau(this.plateau);
		}
	}
}
