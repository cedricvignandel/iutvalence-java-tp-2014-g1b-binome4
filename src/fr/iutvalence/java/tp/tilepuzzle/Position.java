package fr.iutvalence.java.tp.tilepuzzle;

/**
 * Représente une position sur un plateau
 */
public class Position
{
	/**
	 * Ligne
	 */
	private final int ligne;
	/**
	 * Colonne
	 */
	private final int colonne;
	
	/**
	 * Défini une position sur la ligne et la colonne indiquée
	 * @param ligne Ligne
	 * @param colonne Colonne
	 */
	public Position(int ligne, int colonne)
	{
		super();
		this.ligne = ligne;
		this.colonne = colonne;
	}

	/**
	 * @return
	 */
	public int getLigne()
	{
		return this.ligne;
	}

	/**
	 * @return
	 */
	public int getColonne()
	{
		return this.colonne;
	}

	@Override
	public String toString()
	{
		return "Position [ligne=" + this.ligne + ", colonne=" + this.colonne + "]";
	}
	
	
	
}
