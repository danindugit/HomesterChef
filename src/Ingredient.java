/**
 * @author Danindu
 *Date: 2020 06 12
 *Desc.: A class for an ingredient object, which includes private data such as the quantity and name of the ingredient.
 *Method List: 
 *		public Ingredient() 
 *		public String getName()
 *		public void setName(String name)
 *		public int getQuantity()
 *		public void setQuantity(int quantity) 
 *		public static void main(String[] args) 
 */

public class Ingredient {
	private String name;
	private int quantity;
	
	public Ingredient() {
		this.setName("");
		this.setQuantity(0);
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
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
