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

	/**
	 * @return the list
	 */
	public Ingredient[] getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(Ingredient[] list) {
		this.list = list;
	}

	/**
	 * @return the maxSize
	 */
	public int getMaxSize() {
		return maxSize;
	}

	/**
	 * @param maxSize the maxSize to set
	 */
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
