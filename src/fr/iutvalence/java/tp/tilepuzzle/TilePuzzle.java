package fr.iutvalence.java.tp.tilepuzzle;

/**
 * Classe principale du jeu, initialise la partie en créant un plateau et un joueur.
 */
public class TilePuzzle
{

	/**
	 * Plateau
	 */
	private final Plateau plateau;
	
	public Plateau getPlateau()
	{
		return this.plateau;
	}

	/**
	 * Joueur
	 */
	private final Joueur joueur;
	
	/**
	 * Support d'affichage
	 */
	private Affichage affichage;
	
	/**
	 * Crée une partie prête à être jouée.
	 * Cela implique la mise en place d'un plateau et d'un joueur pour cette partie.
	 * @param joueur Joueur a utiliser
	 * @param fdp Fabrique de plateau utilisée pour la partie
	 */
	public TilePuzzle(Joueur joueur, FabriqueDePlateau fdp)
	{
		// TODO définir des constantes
		this.plateau = fdp.obtenirPlateauDefini(10, 6, 10);
		this.joueur = joueur;
	}

	public int obtenirLargeurPlateau()
	{
		return this.plateau.obtenirLargeur();
	}
	
	public int obtenirHauteurPlateau()
	{
		return this.plateau.obtenirHauteur();
	}
	/**
	 * Lance la partie
	 */
	public void jouer()
	{
		while (this.plateau.obtenirNombreDeCasesAllumees() < this.plateau.obtenirHauteur()*this.plateau.obtenirLargeur())
		{
			this.affichage.afficherPlateau(this.plateau);
			this.affichage.afficherDemandePosition();
			this.plateau.inverserCasesAutourDe(this.joueur.getPosition(this.plateau.obtenirHauteur(),this.plateau.obtenirLargeur()));
		}
	}

	public void associerAffichage(Affichage affichage2)
	{
		this.affichage = affichage;
	}
}
