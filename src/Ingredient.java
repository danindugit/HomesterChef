/**
 * @author Danindu
 *Date: 2020 06 12
 *Desc.: A class for an ingredient object, which includes private data such as the quantity and name of the ingredient.
 *Method List: 
 *		public Ingredient() *
 *		public Ingredient(String name, int quantity)*
 *		public String getName()*
 *		public void setName(String name)*
 *		public int getQuantity()*
 *		public void setQuantity(int quantity) *
 *		public static void main(String[] args) 
 */

public class Ingredient {
	private String name;
	private int quantity;
	
	public Ingredient() {
		this.setName("");
		this.setQuantity(0);
	}
	//constructor with fields
	public Ingredient(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
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

	@Override
	public String toString() {
		return "Ingredient [name=" + this.getName() + ", quantity=" + this.getQuantity() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
