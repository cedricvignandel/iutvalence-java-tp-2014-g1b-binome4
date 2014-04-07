package fr.iutvalence.java.tp.tilepuzzle;

import java.util.Random;

/**
 * Permet d'obtenir un plateau généré alatoirement
 */
public class FabriqueDePlateauAleatoire implements FabriqueDePlateau
{
	/**
	 * Taille par défaut d'un plateau généré aléatoirement
	 */
	public static final int TAILLE_PAR_DEFAUT = 3;
	
	@Override
	public Plateau obtenirPlateau()
	{
		boolean[][] tableau = new boolean[TAILLE_PAR_DEFAUT][TAILLE_PAR_DEFAUT];
		for  (int ligne = 0; ligne < TAILLE_PAR_DEFAUT; ligne++)
		{
			for (int colonne = 0; colonne < TAILLE_PAR_DEFAUT; colonne++)
			{
				tableau[ligne][colonne] = Plateau.CASE_ETEINTE;
			}
		}
		return new Plateau(tableau);
	}
	
	@Override
	public Plateau obtenirPlateauDefini(int hauteur, int largeur, int difficulte)
	{
		boolean[][] tableau = new boolean[hauteur][largeur];
		for  (int ligne = 0; ligne < hauteur; ligne++)
		{
			for (int colonne = 0; colonne < largeur; colonne++)
			{
				tableau[ligne][colonne] = Plateau.CASE_ETEINTE;
			}
		}
		
		Plateau plateau = new Plateau(tableau);
		
		int nombreDeCasesAAllumer = (int) Math.round((difficulte/20.0)*hauteur*largeur);
		Random machineAlea = new Random();
		while (plateau.getCasesAllumees() != nombreDeCasesAAllumer)
		{
			Position positionAlea = new Position(machineAlea.nextInt(hauteur-1), machineAlea.nextInt(largeur-1));
			plateau.inverserCasesAutourDe(positionAlea);
		}
		
		return plateau;
	}

}
