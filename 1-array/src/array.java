// @author n-k-t

// Import the pre-defined array package.
import java.util.Arrays;

// Creation of an array as an example data structure.
public class array {

	/**
	 * In this program I am just declaring and creating/filling a random array of size x (integer) and a second
	 * array with a few random inputs.
	 * ---------------
	 * @param args - An array of type of String that holds all of the supplied command line arguments. It 
	 * essentially allows me to pass arguments to the java program through the command line.
	 */
	public static void main(String[] args) {
		// TODO Could expand more here with generic arrays in a method.
		
		/**
		 * Instead of the declaration and initialization below, I could do everything in one step as such:
		 * int x = 3;
		 */
		
		// Declaring an integer variable, x.
		int x;
		
		// Initializing x as 3;
		x = 3;
		
		// Creating an array of integers of size x (3).
		int[] intArray = new int[x];
		
		// Filling up the array.
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		
		// Printing the array to the console.
		System.out.println(Arrays.toString(intArray));
		
		// Creating and filling an array of strings which is a fixed size after this declaration.
		String[] strArray = {"Apple", "Dog", "Code"};
		
		// Printing the newest array to the console.
		System.out.println(Arrays.toString(strArray));
		
	}

}
