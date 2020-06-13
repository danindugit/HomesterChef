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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
