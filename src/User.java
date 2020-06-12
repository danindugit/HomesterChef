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
		this.inventory = new IngredientList ();
		this.recipes = new RecipeList();
		this.name = "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
