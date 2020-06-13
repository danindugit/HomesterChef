/**
 * @author Danindu
 *Date: 2020 06 12
 *Desc.: A class for a recipe object, which includes private data for the ingredients needed and the instructions. 
 * This object will also be able to compare if the user has the necessary ingredients for the recipe.
 *Method List: 
 *		public Recipe()
 *		public String getName() 
 *		public void setName(String name)
 *		public IngredientList getIngNeeded()
 *		public void setIngNeeded(IngredientList ingNeeded)
 *		public String getInstructions()
 *		public void setInstructions(String instructions)
 *		public boolean compareToInv (User person)
 *		public static void main(String[] args) 
 */

public class Recipe {
	private String name;
	private IngredientList ingNeeded;
	private String instructions;
	public Recipe() {
		this.setIngNeeded(new IngredientList());
		this.setInstructions("");;
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
	 * @return the ingNeeded
	 */
	public IngredientList getIngNeeded() {
		return ingNeeded;
	}

	/**
	 * @param ingNeeded the ingNeeded to set
	 */
	public void setIngNeeded(IngredientList ingNeeded) {
		this.ingNeeded = ingNeeded;
	}

	/**
	 * @return the instructions
	 */
	public String getInstructions() {
		return instructions;
	}

	/**
	 * @param instructions the instructions to set
	 */
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	//a method to check if the user has enough of the right ingredients to make the recipe
	public boolean compareToInv (User person) {
		for (int i = 0; i < this.getIngNeeded().getSize(); i++) {//loop through each required ingredient
			int index = person.getInventory().nameBinarySearch(this.getIngNeeded().getList()[i].getName()); //search for the ingredient in the user's inventory
			if (index == -1 || person.getInventory().getList()[index].getQuantity()==0) {  //not found or the user has 0 of that ingredient
				return false;
			}
			else {
				if (this.getIngNeeded().getList()[i].getQuantity()>person.getInventory().getList()[index].getQuantity()) {  //if the required quantity is greater than the user's quantity
					return false;
				}
				else {
					continue;  //this means that there is no issue with the ingredient that the loop is on right now, so continue to the next
				}
			}
		}
		return true; //if the loop was completed without returning false, that means the user has the required ingredients
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
