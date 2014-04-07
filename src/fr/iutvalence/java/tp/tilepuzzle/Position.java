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
		this.ligne = ligne;
		this.colonne = colonne;
	}

	/**
	 * Genere une position à partir d'une chaine de caractères de la forme LIGNE/COLONNE
	 * @param chaine La chaine a convertir
	 * @return Renvoi une nouvelle position
	 */
	public static Position parsePosition(String chaine)
	{
		int separateur = chaine.indexOf("/");
		if (separateur== -1)
		{
			return null;
		}
		int ligne = Integer.parseInt(chaine.substring(0,separateur));
		int colonne = Integer.parseInt(chaine.substring(separateur+1));
		return new Position(ligne,colonne);
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
