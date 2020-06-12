/**
 * @author Danindu
 *Date: 2020 06 12
 *Desc.: A class for an RecipeList object, that allows the creation and modification of a list of recipes.
 *Method List: 
 *		
 */

public class RecipeList {
	private Recipe list[];
    private int maxSize;
    private int size;
	public RecipeList() {
		this.maxSize = 20;
        this.list  = new Recipe[maxSize];
        this.size= 0 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
