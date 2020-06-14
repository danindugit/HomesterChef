/**
 * @author Danindu
 *Date: 2020 06 14
 *Desc.: A class for the Main GUI
 *Method List: 
 *		public MenuUI()
 *		public void actionPerformed(ActionEvent e)
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
	private User u;
	private RecipeList rList;
	private Recipe waffles, pancakes, pizza, frenchf, frencht, vancup;
	private IngredientList iList, wIng, panIng, pIng, ffIng, ftIng, vcIng;
	private Ingredient flour, salt, bakingp, sugar, eggs, milk, butter, vanilla, pYeast, pWater, pFlour, pOil, pSalt, pSugar, pCorn, ffSalt, ffPot, ftBread, ftEggs, ftMilk, ftCin, ftNutmeg, ftVan, ftSalt, vcFlour, vcBakingp, vcSalt, vcEggs, vcSugar, vcButter, vcVan, vcMilk;
	private Color beta;
	private ImagePicture bg;
	private JButton btnRecipes, btnIng;  //buttons to navigate to the ingredient list ui and the recipes ui
	private int width, height;

	public MenuUI() {
		super("Homester Chef");  //frame title
		//initializing frame width and height
		width =500;
		height = 500;
		
		//creating user and its recipe list and inventory
		u = new User();
		//creating inventory
		iList = new IngredientList();
		flour = new Ingredient("Flour", 2);
		salt = new Ingredient("Salt", 1);
		bakingp = new Ingredient("Baking Powder", 4);
		sugar = new Ingredient("Sugar", 2);
		eggs = new Ingredient("Eggs", 2);
		milk = new Ingredient("Milk", 1);
		butter = new Ingredient("Butter", 1);
		vanilla = new Ingredient("Vanilla Extract", 1);
		iList.insert(flour);
		iList.insert(salt);
		iList.insert(bakingp);
		iList.insert(sugar);
		iList.insert(eggs);
		iList.insert(milk);
		iList.insert(butter);
		iList.insert(vanilla);
		u.setInventory(iList);
		//creating waffle recipe
		wIng = new IngredientList();
		wIng.insert(flour);
		wIng.insert(salt);
		wIng.insert(bakingp);
		wIng.insert(sugar);
		wIng.insert(eggs);
		wIng.insert(milk);
		wIng.insert(butter);
		wIng.insert(vanilla);
		waffles.setIngNeeded(wIng);
		waffles.setInstructions("1. Mix all the batter until smooth \n2. Poor a cup of the batter in the waffle cooker. Cook until golden-brown. \n3. Enjoy!");
		waffles.setName("Waffles");
		//creating pancake recipe
		panIng = new IngredientList();
		panIng.insert(flour);
		panIng.insert(salt);
		panIng.insert(bakingp);
		panIng.insert(sugar);
		panIng.insert(eggs);
		panIng.insert(milk);
		panIng.insert(butter);
		panIng.insert(vanilla);
		pancakes.setIngNeeded(panIng);
		pancakes.setInstructions("1. Mix all the batter until smooth \n2. Poor a cup of the batter in the pan. Cook until golden-brown. \n3. Enjoy!");
		pancakes.setName("Pancakes");
		//creating pizza recipe
		pIng = new IngredientList();
		pYeast = new Ingredient("Yeast", 2);
		pWater = new Ingredient("Water", 1);
		pFlour = new Ingredient("Flour", 4);
		pOil = new Ingredient("Oil", 2);
		pSalt = new Ingredient("Salt", 2);
		pSugar = new Ingredient("Sugar", 1);
		pCorn = new Ingredient("Corn Meal", 1);
		pIng.insert(pYeast);
		pIng.insert(pWater);
		pIng.insert(pFlour);
		pIng.insert(pOil);
		pIng.insert(pSalt);
		pIng.insert(pSugar);
		pIng.insert(pCorn);
		pizza.setIngNeeded(pIng);
		pizza.setName("Pizza");
		//creating French Fries recipe
		ffIng = new IngredientList();
		ffSalt = new Ingredient("Salt", 2);
		ffPot = new Ingredient("Potatoes", 1);
		ffIng.insert(ffSalt);
		ffIng.insert(ffPot);
		frenchf.setIngNeeded(ffIng);
		frenchf.setName("French Fries");
		//creating French Toast recipe
		ftIng = new IngredientList();
		ftBread = new Ingredient("Bread", 2);
		ftEggs = new Ingredient("Eggs", 1);
		ftMilk = new Ingredient("Milk", 1);
		ftCin = new Ingredient("Cinnamon", 1);
		ftNutmeg = new Ingredient("Nutmeg", 1);
		ftVan = new Ingredient("Vanilla Extract", 1);
		ftSalt = new Ingredient("Salt", 1);
		ftIng.insert(ftBread);
		ftIng.insert(ftEggs);
		ftIng.insert(ftMilk);
		ftIng.insert(ftCin);
		ftIng.insert(ftNutmeg);
		ftIng.insert(ftVan);
		ftIng.insert(ftSalt);
		frenchf.setIngNeeded(ftIng);
		frenchf.setName("French Toast");
		//creating Vanilla Cupcakes Recipe
		vcIng = new IngredientList();
		vcFlour = new Ingredient("Flour", 2);
		vcBakingp = new Ingredient("Baking Powder", 1);
		vcSalt = new Ingredient("Salt", 1);
		vcEggs = new Ingredient("Eggs", 1);
		vcSugar = new Ingredient("Sugar", 1);
		vcButter = new Ingredient("Butter", 1);
		vcVan = new Ingredient("Vanilla Extract", 1);
		vcMilk = new Ingredient("Milk", 1);
		vcIng.insert(vcFlour);
		vcIng.insert(vcBakingp);
		vcIng.insert(vcSalt);
		vcIng.insert(vcEggs);
		vcIng.insert(vcSugar);
		vcIng.insert(vcButter);
		vcIng.insert(vcVan);
		vcIng.insert(vcMilk);
		vancup.setIngNeeded(vcIng);
		vancup.setName("Vanilla Cupcakes");
		u.setRecipes(rList);//setting this as the user's recipe list
		
		//creating color
		beta = new Color(235, 64, 52);
		
		//creating ImagePicture 
		bg = new ImagePicture(new ImageIcon("bg500.png"),0,0);
		//creating buttons
		btnRecipes = new JButton ("View Recipes");
		btnRecipes.setBackground(beta);
		btnRecipes.setForeground(Color.WHITE);
		btnRecipes.addActionListener(this);
		btnIng = new JButton ("View Ingredients");
		btnIng.setBackground(beta);
		btnIng.setForeground(Color.WHITE);
		btnIng.addActionListener(this);
		
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
			RecipesUI recsUI = new RecipesUI(u);
			this.dispose();
		}
		else if(e.getSource()==btnIng) {
			IngUI ingsUI= new IngUI(u);
			this.dispose();
		}
	}

}
