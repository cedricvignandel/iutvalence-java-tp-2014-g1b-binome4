package fr.iutvalence.java.tp.tilepuzzle;

/**
 * Définit un plateau de jeu, il est défini par une hauteur et une largeur, 
 * représentées en nombre de cases, chacune pouvant être allumée ou éteinte.
 */
public class Plateau
{
	/**
	 * Largeur par défaut d'un plateau
	 */
	protected static final int TAILLE_PAR_DEFAUT = 3;
	/**
	 * Valeur d'une case éteinte sur la grille
	 */
	protected static final boolean CASE_ETEINTE = false;
	
	/**
	 * Largeur du plateau
	 */
	protected int largeur;
	
	/**
	 * Hauteur du plateau
	 */
	protected int hauteur;
	
	/**
	 * Nombre de cases allumées sur le plateau
	 */
	protected int casesAllumees;
	
	/**
	 * Tableau des cases du plateau
	 */
	protected boolean[][] cases;

	/**
	 * Crée un nouveau plateau a partir du tableau fourni
	 * @param tableau Tableau à partir duquel on génère le plateau
	 */
	public Plateau(boolean[][] tableau)
	{
		this.hauteur = tableau.length;
		this.largeur = tableau[0].length;
		this.cases = tableau;
		this.casesAllumees = 0;
		for  (int ligne = 0; ligne < this.hauteur; ligne++)
		{
			for (int colonne = 0; colonne < this.largeur; colonne++)
			{
				if (this.cases[ligne][colonne] != CASE_ETEINTE)
				{
					this.casesAllumees++;
				}
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
		for (int ligne = 0; ligne < this.hauteur; ligne++)
		{
			for (int colonne = 0; colonne < this.largeur; colonne++)
			{
				if (this.cases[ligne][colonne])
				{
					plateauAffichable = plateauAffichable+"O"+" ";
				}
				else
				{
					plateauAffichable = plateauAffichable+"-"+" ";
				}
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
	public boolean estPositionValide(Position position)
	{
		return ((position.getLigne()>=0)&&(position.getLigne()<this.hauteur)&&((position.getColonne()>=0)&&(position.getColonne()<this.largeur)));
	}
	/**
	 * Inverse l'état de la case indiquée et met à jour le compteur
	 * @param caseAInverser Case à inverser
	 */
	private void inverserCase(Position caseAInverser)
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
			if ((caseCiblee.adjacente(direction).getLigne() >= 0) && (caseCiblee.adjacente(direction).getLigne() < this.hauteur) &&
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
	 * @return la hauteur
	 */
	public int getHauteur()
	{
		return this.hauteur;
	}
	
	/**
	 * @return le nombre de cases allumées
	 */
	public int getCasesAllumees()
	{
		return this.casesAllumees;
	}
}
