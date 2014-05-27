package fr.iutvalence.java.tp.tilepuzzle;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
/**
 * 
 * @author vignandc
 *
 */
public class MonJButton extends JButton
{
	/**
	 * 
	 */
	private int largeurCase;
	/**
	 * 
	 */
	private int hauteurCase;



	/**
	 * 
	 * @param largeurCase
	 * @param hauteurCase
	 */
	
	public MonJButton(Position position)
	{
		this.largeurCase=position.getLigne();
		this.hauteurCase=position.getColonne();
		if ( .estCaseAllumee(position));
			
	}


	/**
	 * 
	 * @return
	 */
	public int getHauteurCase()
	{
		return this.hauteurCase;
	}

	/**
	 * 
	 * @return
	 */
	public int getLargeurCase()
	{
		return this.largeurCase;
	}

}
