package fr.iutvalence.java.tp.tilepuzzle;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
/**
 * 
 * @author vignandc
 *
 */
public class AffichageFenetre implements Affichage
{
/**
 * 
 * @param args
 */
	public AffichageFenetre(int largeur, int hauteur)
	{
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Tile Puzzle");
		fenetre.setSize(200,200);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.getContentPane().setLayout(new GridLayout(largeur,hauteur));
		for(int compteurcase=0;compteurcase<(largeur*hauteur) ;compteurcase++)
		{
			fenetre.getContentPane().add(new JButton());
		}
		fenetre.setVisible(true);
		
	}

@Override
public void afficherDemandePosition()
{
	// TODO Auto-generated method stub
	
}

@Override
public void afficherPlateau(Plateau plateau)
{
	// TODO Auto-generated method stub
	
}

}
