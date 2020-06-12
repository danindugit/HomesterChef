/**
 * @author Danindu
 *Date: 2020 06 12
 *Desc.: A class for an IngredientList object, that allows the creation and modification of a list of ingredients.
 *Method List: 
 *		
 */

public class IngredientList {
	private Ingredient list[];
    private int maxSize;
    private int size;
	public IngredientList() {
		this.maxSize = 20;
        this.list  = new Ingredient[maxSize];
        this.size= 0 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
