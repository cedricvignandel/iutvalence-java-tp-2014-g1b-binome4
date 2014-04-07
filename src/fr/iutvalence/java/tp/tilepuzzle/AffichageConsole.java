package fr.iutvalence.java.tp.tilepuzzle;

/**
 * Gere l'affichage dans la console
 */
public class AffichageConsole implements Affichage
{

	@Override
	public void afficherPlateau(Plateau plateau)
	{
		System.out.println(plateau.toString());
	}

}
