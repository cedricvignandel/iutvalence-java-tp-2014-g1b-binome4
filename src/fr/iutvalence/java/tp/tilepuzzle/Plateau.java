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
	 * Valeur d'une case éteinte sur la grille
	 */
	private static final int CASE_ETEINTE = 0;
	/**
	 * Valeur d'une case allumée sur la grille
	 */
	private static final int CASE_ALLUMEE = 1;
	
	/**
	 * Largeur du plateau
	 */
	private final int largeur;
	
	// TODO(fait) réfléchir aux valeurs que peuvent prendre les cases du tableau (constantes)
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
		for  (int ligne = 0; ligne < this.largeur; ligne++)
		{
			for (int colonne = 0; colonne < this.largeur; colonne++)
			{
				// TODO(fait) définir 0 comme une constante
				this.cases[ligne][colonne] = CASE_ETEINTE;
			}
		}
	}
	
	/**
	 *  Affiche le plateau dans la console
	 */
	public void afficherPlateau()
	{
		for (int ligne = 0; ligne < this.largeur; ligne++)
		{
			for (int colonne = 0; colonne < this.largeur; colonne++)
			{
				System.out.print(this.cases[ligne][colonne]);
			}
			System.out.println();
		}
	}
	
	/**
	 * Change l'état de la case indiquée
	 * @param caseAChanger Case à modifier
	 */
	public void activerCase(Position caseAChanger)
	{
		if (this.cases[caseAChanger.getLigne()][caseAChanger.getColonne()] == CASE_ALLUMEE)
		{
			this.cases[caseAChanger.getLigne()][caseAChanger.getColonne()] = CASE_ETEINTE;
		}
		else 
		{
			this.cases[caseAChanger.getLigne()][caseAChanger.getColonne()] = CASE_ALLUMEE;
		}
	}
}
