/**
 * @author Danindu
 *Date: 2020 06 12
 *Desc.: A class for a user object, which includes private data for a user's name, list of ingredients, and list of recipes.
 *Method List: 
 *		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
