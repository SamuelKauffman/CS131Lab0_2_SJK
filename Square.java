
/**
 * @author Sam Kauffman
 * 
 */
public class Square {
	private double mSide;
		/**
		 * 
		 */
		public Square(){
			mSide = 0;
		}//end of constructor
		/**
		 * @param side
		 */
		public Square(double side) {
			mSide = side;
		}//end of constructor
		/**
		 * @return
		 */
		public double getSide() {
			return mSide;
		}//end of getSide
		/**
		 * @param side
		 */
		public void setSide(double side) {
			mSide=side;
		}//end of setSide
		/**
		 * @return Squares the length of side to find area
		 */
		public double getArea() {
			return Math.pow(mSide, 2);
		}//end of getArea
}
