package lectureworkspace.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		// random requires import java.util.Random
		Random rand = new Random();
		System.out.println("\n*** Array Example ***");
		// create an array that can hold 7 elements of type int
		// notice the square brackets indicating an array
		int[] nums = new int[7];

		//		initialize the elements in the array with a random integer for each element
		//		arrays are 0 indexed so a 7 element array contains elements 0, 1, 2, 3, 4, 5, 6.
		//		we are just going to initialize elements 0 through 4
		for (int i = 0; i < 5; i++)
		{
			nums[i] = rand.nextInt(10);
		}

		// we reference a particular element with the name of the array and the element's id number surrounded by square
		// brackets
		System.out.println("The third element of the array is " + nums[2]);

		System.out.println("\nPrint using a for each loop");
		// to print the elements in the entire array, we will use a special form of the For loop.
		// we are using a for-each loop.  this loops through the elements in the array 1 by 1 in order
		// whether those elements have been initialized or not
		for (int el : nums)
		{
			System.out.println("Item: " + el);
		}

		System.out.println("\nPrint using a regular for loop");
		// array.length returns the number of elements in the array
		// the last element in the array is always 1 less than this number
		// due to the array's indices being 0 based
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("Array element " + i + ": " + nums[i]);
		}

		System.out.println("\n*** Another Array Example ***");
		// let's handle an array of Strings. We can initialize an array using a list of values. The size of the array is
		// set as the number of items in the list.
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

		// we can find out the length of the array by calling a field in the example
		System.out.println(cars.length);

		// we can access the first element in the array with index 0
		System.out.println(cars[0]);
		// we can change the second element in the array
		cars[1] = "Honda";
		// we can change the second el in the array
		cars[2] = "Honda";
		// print the array's pointer
		System.out.println(cars);

		System.out.println("Before sort Element index 2 " + cars[2]);
		// the Arrays class requires the import java.util.Arrays
		// we can sort the elements of the array in ascending order using the Arrays class. This actually changes the
		// order of the elements in the array
		Arrays.sort(cars);
		System.out.println("After sort Element index 2 " + cars[2]);

		// The Collections class requires the import java.util.Collections
		// we can sort ehe elements of the array in descending order using the Arrays and Collections class
		System.out.println("Before sort: " + Arrays.toString(cars));
		Arrays.sort(cars);
		System.out.println("After ascending sort: " + Arrays.toString(cars));
		Arrays.sort(cars, Collections.reverseOrder());
		System.out.println("After descending sort: " + Arrays.toString(cars));
	}
}
