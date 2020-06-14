/**
 * @author Danindu
 *Date: 2020 06 12
 *Desc.: A class for a user object, which includes private data for a user's name, list of ingredients, and list of recipes.
 *Method List: 
 *		public User() *
 *		public String getName() *
 *		public void setName(String name) *
 *		public IngredientList getInventory() *
 *		public void setInventory(IngredientList inventory) *
 *		public RecipeList getRecipes() *
 *		public void setRecipes(RecipeList recipes) *
 *		public void makeRecipe(Recipe r) *
 *		public static void main(String[] args) *
 */

public class User {
	private String name;
	private IngredientList inventory;
	private RecipeList recipes;
	public User() {
		this.setInventory(new IngredientList ());
		this.setRecipes(new RecipeList());
		this.setName("");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the inventory
	 */
	public IngredientList getInventory() {
		return inventory;
	}

	/**
	 * @param inventory the inventory to set
	 */
	public void setInventory(IngredientList inventory) {
		this.inventory = inventory;
	}

	/**
	 * @return the recipes
	 */
	public RecipeList getRecipes() {
		return recipes;
	}

	/**
	 * @param recipes the recipes to set
	 */
	public void setRecipes(RecipeList recipes) {
		this.recipes = recipes;
	}

	//method that adjusts quantity of user inventory when a recipe is made
	public void makeRecipe(Recipe r) {
		for (int i = 0; i < r.getIngNeeded().getSize(); i++) {  //loop through all of the required ingredients of the recipe
			int index = this.getInventory().nameBinarySearch(r.getIngNeeded().getList()[i].getName()); //get the index of the ingredient in the user's inventory
			this.getInventory().getList()[index].setQuantity(this.getInventory().getList()[index].getQuantity()-r.getIngNeeded().getList()[i].getQuantity());  //decrease the ingredient's quantity in the user's inventory based on the quantity required in the recipe
		}
	}

	@Override
	public String toString() {
		return "User [name=" + this.getName() + ", inventory= \n" + this.getInventory().toString() + ", recipes= \n" + this.getRecipes().toString() + "]";
	}
	//self-testing main
	public static void main(String[] args) {
		User u = new User ();//creating a new user object
		u.setName("Dan");

		IngredientList iList = new IngredientList ();//creating a new ingredientList
		//creating salt and adding to the list
		Ingredient salt = new Ingredient();
		salt.setName("Salt");
		salt.setQuantity(10);
		iList.insert(salt);
		//creating pepper and sugar and adding it to the list
		Ingredient pepper = new Ingredient ("Pepper", 15);
		Ingredient sugar = new Ingredient ("Sugar", 20);
		iList.insert(pepper);
		iList.insert(sugar);
		u.setInventory(iList);  //setting iList as the user's Inventory
		//creating a recipe list
		RecipeList rList = new RecipeList();
		//a recipe that the user can't make
		Recipe r1 = new Recipe();
		r1.setName("Cannot make");
		//making ingredients and adding it to the recipe's required ingredients
		IngredientList recIng1 = new IngredientList();
		Ingredient recSalt1 = new Ingredient ("Salt", 10);
		Ingredient recPepper1 = new Ingredient ("Pepper", 15);
		Ingredient recSugar1 = new Ingredient ("Sugar", 21);  //user only has 20 sugar, this recipe requires 21
		recIng1.insert(recSalt1);
		recIng1.insert(recPepper1);
		recIng1.insert(recSugar1);
		r1.setIngNeeded(recIng1);//setting the required ingredients list for r1 as recIng1
		r1.setInstructions("Just cook and eat.");  //setting r1's recipe instructions

		//a recipe that the user can make
		Recipe r2 = new Recipe();
		r2.setName("Can make");
		//making ingredients and adding it to the recipe's required ingredients
		IngredientList recIng2 = new IngredientList();
		Ingredient recSalt2 = new Ingredient ("Salt", 10);
		Ingredient recPepper2 = new Ingredient ("Pepper", 15);
		Ingredient recSugar2 = new Ingredient ("Sugar", 20);
		recIng2.insert(recSalt2);
		recIng2.insert(recPepper2);
		recIng2.insert(recSugar2);
		r2.setIngNeeded(recIng2);//setting the required ingredients list for r2 as recIng2
		r2.setInstructions("Just cook and eat2.");  //setting r2's recipe instructions
		//adding the 2 recipes to the user's recipe list and setting rList as the user's recipe list
		rList.insert(r1);
		rList.insert(r2);
		u.setRecipes(rList);
		//displaying the user's initial info
		System.out.println("User's Initial Info:");
		System.out.println(u.toString());
		//testing the compareToInv method
		System.out.println("Trying to make recipe 1:");
		if (r1.compareToInv(u)==false) {
			System.out.println("You don't have sufficient ingredients.");
		}
		else {
			System.out.println("You have sufficient ingredients.");
		}
		//changing recipe 1 to be sufficient - replacing recSugar1 with recSugar2
		System.out.println();
		recIng1.change(recSugar1, recSugar2);
		System.out.println("Trying to make recipe 1 with changed ingredient requirements:");
		if (r1.compareToInv(u)==false) {
			System.out.println("You don't have sufficient ingredients.");
		}
		else {
			System.out.println("You have sufficient ingredients.");
		}

		System.out.println("\nTrying to make recipe 2:");		
		if (r2.compareToInv(u)==false) {
			System.out.println("You don't have sufficient ingredients.");
		}
		else {
			System.out.println("You have sufficient ingredients.");
			u.makeRecipe(r2);  //make the recipe, which should set the user's ingredients all to 0
		}
		//displaying the user's final info
		System.out.println();
		System.out.println("User's final info:");
		System.out.println(u.toString());

		//deleting the user's sugar
		u.inventory.delete(sugar);
		//displaying the user's final info
		System.out.println();
		System.out.println("User's final info after deleting their sugar ingredient:");
		System.out.println(u.toString());

		//deleting Recipe 2
		u.recipes.delete(r2);
		//displaying the user's final info
		System.out.println();
		System.out.println("User's final info after deleting Recipe 2:");
		System.out.println(u.toString());
	}

}
