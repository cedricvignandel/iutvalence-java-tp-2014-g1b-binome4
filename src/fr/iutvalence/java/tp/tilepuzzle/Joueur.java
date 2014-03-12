package fr.iutvalence.java.tp.tilepuzzle;

import java.util.Random;

/**
 * Définit un joueur, capable d'interagir avec le plateau.
 */
public class Joueur
{
	/**
	 * Crée un nouveau joueur
	 */
	public Joueur()
	{
		
	}
	
	/**
	 * Genère une position correspondant à la case à activer
	 * @return Renvoi la position de la case à activer
	 */
	public Position getPosition()
	{
		Random machineAlea = new Random();
		return new Position(machineAlea.nextInt(3), machineAlea.nextInt(3));
	}
}
