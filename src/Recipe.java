/**
 * @author Danindu
 *Date: 2020 06 12
 *Desc.: A class for a recipe object, which includes private data for the ingredients needed and the instructions. 
 * This object will also be able to compare if the user has the necessary ingredients for the recipe.
 *Method List: 
 *		
 */

public class Recipe {
	private IngredientList ingNeeded;
	private String instructions;
	public Recipe() {
		this.ingNeeded = new IngredientList();
		this.instructions= "";
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}