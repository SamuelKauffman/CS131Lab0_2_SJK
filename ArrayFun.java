
/**
 * @author Sam Kauffman
 *
 */
public class ArrayFun {
	private int mNum;
	Square[] myArray;

	/**
	 * Counting up until hit mNum which was assigned to 6
	 */
	public ArrayFun() {
		mNum=6;
		myArray = new Square[mNum];
		for (int i = 0; i < mNum; i++) {
			myArray[i] = new Square(i);
		}
	}//end of constructor

	/**
	 * @param index
	 * @return 
	 */
	public Square getArrayItem(int index) {
		return this.myArray[index];
	}//end of getArrayItem

	/**
	 * @param index of the array
	 * @param s sets index
	 */
	public void setArrayItem(int index, Square s) {
		this.myArray[index] = s;
	}//end of setArrayItem

	/**
	 * Counts forward until 6 and calculates their area
	 */
	public void forward() {
		for (int i = 0; i < mNum; i++) {
			System.out.println("The Area for " + i + " is " + myArray[i].getArea());
		}
	}//end of forward

	/**
	 * counts backwards and calculates area
	 */
	public void backward() {
		for (int i = mNum - 1; i > 0; i--) {
			System.out.println("The Area for " + i + " is " + myArray[i].getArea());
		}
	}//end of backward

	/**
	 * adds all the square areas
	 */
	public void sum() {
		int sum = 0;
		for (int i = 0; i < mNum; i++) {
			sum += myArray[i].getArea();
			System.out.println("The sum of the areas are: " + sum);

		}
	}//end of sum
}
