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
	
	/**
	 * Nombre de cases allumées sur le plateau
	 */
	private int casesAllumees;
	
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
		this.casesAllumees = 0;
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
	 *  Renvoi le contenu du plateau sous forme d'une chaine
	 * @return Chaine representant le plateau
	 */
	public String toString()
	{
		String plateauAffichable = "";
		for (int ligne = 0; ligne < this.largeur; ligne++)
		{
			for (int colonne = 0; colonne < this.largeur; colonne++)
			{
				plateauAffichable = plateauAffichable+this.cases[ligne][colonne];
			}
			plateauAffichable = plateauAffichable+"\n";
		}
		return plateauAffichable;
	}
	
	/**
	 * Change l'état de la case indiquée
	 * @param caseAInverser Case à modifier
	 */
	public void inverserCase(Position caseAInverser)
	{
		if (this.cases[caseAInverser.getLigne()][caseAInverser.getColonne()] == CASE_ALLUMEE)
		{
			this.cases[caseAInverser.getLigne()][caseAInverser.getColonne()] = CASE_ETEINTE;
			this.casesAllumees--;
		}
		else 
		{
			this.cases[caseAInverser.getLigne()][caseAInverser.getColonne()] = CASE_ALLUMEE;
			this.casesAllumees++;
		}
	}
	
	/**
	 * @param caseCiblee Case centrale du motif qui va changer
	 */
	public void inverserCasesAutourDe(Position caseCiblee)
	{
		inverserCase(caseCiblee);
		for (Direction direction : Direction.values())
			inverserCase(caseCiblee.adjacente(direction));
	}

	/**
	 * @return la largeur
	 */
	public int getLargeur()
	{
		return this.largeur;
	}
	
	/**
	 * @return le nombre de cases allumées
	 */
	public int getCasesAllumees()
	{
		return this.casesAllumees;
	}
}
