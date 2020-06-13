import java.util.Arrays;

/**
 * @author Danindu
 *Date: 2020 06 12
 *Desc.: A class for an IngredientList object, that allows the creation and modification of a list of ingredients.
 *Method List: 
 *		public IngredientList()
 *		public Ingredient[] getList()
 *		public void setList(Ingredient[] list)
 *		public int getMaxSize()
 *		public void setMaxSize(int maxSize)
 *		public int getSize()
 *		public void setSize(int size) 
 *		public boolean insert (Ingredient g)
 *		public boolean delete (Ingredient record) 
 *		public boolean change (Ingredient oldRec, Ingredient newRec)
 *		public int nameBinarySearch (String name) 
 *		public void swap( Ingredient array[], int first, int second )
 *		public void nameQuickSort(Ingredient array[], int aMin, int aMax)
 *		public static void main(String[] args)
 */

public class IngredientList {
	private Ingredient list[];
    private int maxSize;
    private int size;
	public IngredientList() {
		this.setMaxSize(20);
        this.setList(new Ingredient[maxSize]);
        this.setSize(0);
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
	
	//boolean method to insert an ingredient to the ingredient list
	public boolean insert (Ingredient g) {
		if (this.getSize()<maxSize) {
			this.getList()[size] = g;  //adding the record to the list at next available index
			size++;			//increasing the size by 1
			return true;
		}
		return false;
	}
	
	//boolean method to delete an ingredient from the ingredient list
	public boolean delete (Ingredient record) {
		//sorting by first name alphabetical order
		this.nameQuickSort(list, 0, size-1);
		//finding index of record to delete
		int index = this.nameBinarySearch(record.getName());
		//if found
		if(index >= 0) {
			//move record to end of list and decrease list size by 1
			list[index] = list[size-1];
			size--;
			//sorting again based on first name
			this.nameQuickSort(list, 0, size-1);
			return true;
		}
		//not found
		return false;
	}
	
	//boolean method to change an ingredient in the ingredient list
	public boolean change (Ingredient oldRec, Ingredient newRec) {		
		int index = this.nameBinarySearch(oldRec.getName());  //searching for old record
		if(index>=0) { //found
			list[index] = newRec; //replacing with new record
			this.nameQuickSort(list, 0, size-1);  //sortinf based on first name alphabetical
			return true;
		}
		//not found
		return false;
	}
	
	//method to search for name using binary search
	public int nameBinarySearch (String name) {
		//sorting records by first name alphabetical order
		this.nameQuickSort(this.getList(), 0, getSize()-1);
		int low = 0;
		int high = this.size-1;
		int middle;

		while (low<=high) {  
			middle = (low+high)/2;
			if (name.compareToIgnoreCase(list[middle].getName()) == 0) {  //check if name found
				return middle;  //return index
			}
			if (name.compareToIgnoreCase(list[middle].getName()) <0) {  //check if name to find is in the lower half
				high = middle-1;  //move the high to one lower than the middle
			}
			else {  //if it is in higher part of the list
				low = middle+1;  //move the low to one higher than the middle
			}
		}
		//not found
		return -1;
	}
	
	//method to swap array elements
	public void swap( Ingredient array[], int first, int second ){		
		Ingredient hold; // temp variable
		hold = array[ first ];
		array[ first ] = array[ second ];
		array[ second ] = hold;
	}
	
	//quicksort method to sort by ingredient name in descending order
		public void nameQuickSort(Ingredient array[], int aMin, int aMax) {
			Ingredient pivot;
			int leftPos, rightPos;

			if (aMin>aMax) {  //nothing more to sort
				return;
			}

			pivot = array[aMin]; //pivot point
			leftPos = aMin;  //starting pos
			rightPos = aMax;	

			do {
				while(pivot.getName().compareTo(array[leftPos].getName())>0) {
					leftPos++;
				}
				while(pivot.getName().compareTo(array[rightPos].getName())<0) {
					rightPos--;
				}
				if (leftPos<=rightPos) {
					if (array[leftPos] != array[rightPos]) {
						swap(array, leftPos, rightPos);
					}
					leftPos++;
					rightPos--;
				}
			}
			while(leftPos<rightPos);

			nameQuickSort(array, aMin, rightPos);  // recur with new limits
			nameQuickSort(array, leftPos, aMax);
		}//END NAME QUICK SORT

	@Override
		public String toString() {
			return "IngredientList [list=" + Arrays.toString(this.getList()) + ", maxSize=" + this.getMaxSize() + ", size=" + this.getSize() + "]";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
