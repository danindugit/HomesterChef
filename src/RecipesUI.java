import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * @author Danindu
 *Date: 2020 06 14
 *Desc.: A class for the Recipes GUI
 *Method List: 
 *		public MenuUI()
 *		public void actionPerformed(ActionEvent e)
 */

public class RecipesUI extends JFrame implements ActionListener{
	//private data
	private User u;
	private RecipeList rList;
	private Recipe waffles, pancakes, pizza, frenchf, frencht, vancup;
	private IngredientList iList;
	private Color beta;
	private ImagePicture bg;
	private JButton btnNew, btnBack, btnList[];  //button to add a new recipe
	private int width, height;

	public RecipesUI(User u) {
		super("Homester Chef");  //frame title
		//initializing frame width and height
		width =500;
		height = 500;
		
		//creating color
		beta = new Color(235, 64, 52);
		
		//creating ImagePicture 
		bg = new ImagePicture(new ImageIcon("bg500.png"),0,0);
		//creating buttons
		btnNew = new JButton("New Ingredient");
		btnNew.setBackground(beta);
		btnNew.setForeground(Color.WHITE);
		btnNew.addActionListener(this);
		btnBack = new JButton("Back");
		btnBack.setBackground(beta);
		btnBack.setForeground(Color.WHITE);
		btnBack.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
