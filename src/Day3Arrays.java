
public class Day3Arrays {

	public static void main(String[] args) 
	{
	  // arrays can be done for any datatype
		String[] cars = {"Mercedes", "Audi", "BMW", "Tesla"};
		
		int[] iArrNum = {1,2,3,4,5};
		System.out.println(iArrNum[2]);
		iArrNum[4] = 55;  // errasing the value or change the value you can overwrite it
		System.out.println(iArrNum[4]);	
		cars[2] = "Toyota";
		System.out.println(cars[2]);
		System.out.println(cars.length);         
		// containing more than one array rows and columns
		// Array of an array
		
		/*int[][] iArr = {{1,2,3},{4,5,6},{7,8,9},{22,33},{44,55}};
		System.out.println(iArr[0][0]);
		System.out.println(iArr[1][1]);
		System.out.println(iArr[4][1]);
		
		System.out.println(iArr.length);
		System.out.println(iArr[1].length);   */
		
		// Strings --> literal, with new key word
		// Difference between equals and ==
		// why is string immutable
		// Static vs Non static variables and methods
		// why is main method Static

	}

}
