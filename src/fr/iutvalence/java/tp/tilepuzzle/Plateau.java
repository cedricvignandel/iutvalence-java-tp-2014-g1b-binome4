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
	private static final int TAILLE_PAR_DEFAUT = 3;
	/**
	 * Valeur d'une case éteinte sur la grille
	 */
	private static final boolean CASE_ETEINTE = false;
	
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
	private boolean[][] cases;

	/**
	 * Crée un nouveau plateau de largeur par défaut, avec toutes les cases
	 * éteintes.
	 */
	public Plateau()
	{
		this.largeur = TAILLE_PAR_DEFAUT;
		this.cases = new boolean[this.largeur][this.largeur];
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
				plateauAffichable = plateauAffichable+this.cases[ligne][colonne]+" ";
			}
			plateauAffichable = plateauAffichable+"\n";
		}
		return plateauAffichable;
	}
	
	/**
	 * Retourne si oui ou non la case se trouve sur le plateau
	 * @param position Position a vérifier
	 * @return true si la position est valide, false si elle ne l'est pas
	 */
	private boolean estPositionValide(Position position)
	{
		return ((position.getLigne()>=0)&&(position.getLigne()<TAILLE_PAR_DEFAUT)&&((position.getColonne()>=0)&&(position.getColonne()<TAILLE_PAR_DEFAUT)));
	}
	/**
	 * Inverse l'état de la case indiquée et met à jour le compteur
	 * @param caseAInverser Case à inverser
	 */
	public void inverserCase(Position caseAInverser)
	{
		if (!estPositionValide(caseAInverser)) return;
		this.casesAllumees += inverserEtat(caseAInverser);
	}

	/**
	 * Inverse l'état d'une case
	 * @param caseAInverser Case sur laquelle on va agir
	 * @return Renvoi 1 si la case s'est allumée ou -1 si elle s'est éteinte
	 */
	private int inverserEtat(Position caseAInverser)
	{
		this.cases[caseAInverser.getLigne()][caseAInverser.getColonne()] =! this.cases[caseAInverser.getLigne()][caseAInverser.getColonne()];
		if (this.cases[caseAInverser.getLigne()][caseAInverser.getColonne()]) return 1;
		return -1;
	}
	
	/**
	 * @param caseCiblee Case centrale du motif qui va changer
	 */
	public void inverserCasesAutourDe(Position caseCiblee)
	{
		inverserCase(caseCiblee);
		for (Direction direction : Direction.values())
			if ((caseCiblee.adjacente(direction).getLigne() >= 0) && (caseCiblee.adjacente(direction).getLigne() < this.largeur) &&
				(caseCiblee.adjacente(direction).getColonne() >= 0) && (caseCiblee.adjacente(direction).getColonne() < this.largeur))
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
