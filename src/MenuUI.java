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
		
		//setting bounds
		bg.setBounds(0, 0, width, height);
		btnRecipes.setBounds(70, 225, 150, 50);
		btnIng.setBounds(280, 225, 150, 50);
		
		//adding to the frame
		add(btnRecipes);
		add(btnIng);
		add(bg);
		
		// set size and location of frame, making it visible
		setSize(width,height); 
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRecipes) {
			//RecUI = new RecUI();
			this.dispose();
		}
		else if(e.getSource()==btnIng) {
			//IngUI = new IngUI();
			this.dispose();
		}
	}

}
