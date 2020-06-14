/**
 * @author Danindu
 *Date: 2020 06 13
 *Desc.: A class for the Main GUI
 *Method List: 
 *		
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuUI extends JFrame implements ActionListener{
	//private data
	private Color beta;
	private ImagePicture bg;
	private JButton btnRecipes, btnIng;  //buttons to navigate to the ingredient list ui and the recipes ui
	private int width, height;

	public MenuUI() {
		super("Homester Chef");  //frame title
		//initializing frame width and height
		width =500;
		height = 500;
		
		//creating color
		beta = new Color(235, 64, 52);
		
		//creating ImagePicture 
		bg = new ImagePicture(new ImageIcon("bg500.png"),0,0);
		//creating buttons
		btnRecipes = new JButton ("View Recipes");
		btnRecipes.setBackground(beta);
		btnRecipes.setForeground(Color.WHITE);
		btnIng = new JButton ("View Ingredients");
		btnIng.setBackground(beta);
		btnIng.setForeground(Color.WHITE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
