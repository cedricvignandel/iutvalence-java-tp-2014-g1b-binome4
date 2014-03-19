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
	 * @return Renvoi la ligne 
	 */
	public int getLigne()
	{
		return this.ligne;
	}

	/**
	 * @return Renvoi la colonne
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

	/**
	 * Renvoie la position adjacente dans la direction indiqué à la case sur laquelle on appelle la méthode.
	 * @param direction Direction dans laquelle on recherche une position adjacente
	 * @return Nouvelle position
	 */
	public Position adjacente(Direction direction)
	{
		return new Position(this.getLigne()+direction.obtenirOffsetLigne(),this.getColonne()+direction.obtenirOffsetColonne());
	}
}
