package lectureworkspace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SampleArrayList
{

	public static void main(String[] args)
	{

		// Declare a list called `cities` which hosts String elements and initialize it as an ArrayList with String.
		// The String data type for initialization (RHS) can be inferred from the String explicitly listed in declaration
		// (LHS). So, instead of `List<String> cities = new ArrayList<String>();`, we can just use simple diamond notation:
		List<String> cities = new ArrayList<>();

		// add some cities to our ArrayList
		cities.add("Lehi");
		cities.add("Seattle");
		cities.add("San Francisco");
		cities.add("Austin");
		cities.add("Denver");
		cities.add("Raleigh");
		cities.add("New York City");

		// adding a (duplicate) value that already exists in the ArrayList is just like adding any other value
		// it goes at the end of the ArrayList
		cities.add("Austin");


		// Displaying the ArrayList. Note that putting the \n at the start of our string to display
		// says to first display a blank line and then display our text.
		System.out.println("\n*** The ArrayList ***");
		System.out.println(cities);

		// To find a particular element in the ArrayList, Use get(index)
		// where index is the index of the element you want.
		// Remember ArrayList are 0 based index, so an ArrayList with 5 elements will have indexes
		// 0, 1, 2, 3, 4
		System.out.println("The element at index 0 is " + cities.get(0));

		// Searching for an index that does not exist in the ArrayList, causes the program to halt
		// with an exception IndexOutOfBounds
		// System.out.println("The element at index 100 is " + cities.get(100));

		// To find if an ArrayList contains a particular value, use contains
		System.out.println();
		System.out.println("The ArrayList contains \"New York City\": " + cities.contains("New York City"));
		System.out.println("The ArrayList contains \"Portland\": " + cities.contains("Portland"));

		// ArrayList have a couple of other usual ways of adding a element
		// set(index, new value) replaces the element at the given index
		// note the \ before the " telling us to display the " not treat them as ending of a string. Treat them as part of the String!
		// This is called escaping the character or just escape character
		System.out.println("\nReplacing element at index 3");
		System.out.println("Original element at index 3: " + cities.get(3));
		cities.set(3, "Portland");
		System.out.println("Replaced element \"Portland\" at index 3: " + cities.get(3));

		// add (index, new value) adds the new element at the given index, pushing all the other elements one index higher
		System.out.println("\nBefore adding element at index 3");
		System.out.println(cities);
		cities.add(3, "Austin");
		System.out.println("After adding \"Austin\" element at index 3");
		System.out.println(cities);


		// THE FOLLOWING IS JUST REPEATING THE ABOVE BUT IN MORE EFFICIENT WAYS :)
		// if you knew which cities you wanted to initialize the constructor with
		List<String> cities2 = new ArrayList<>(Arrays.asList("Lehi",
		                                                     "Seattle",
		                                                     "San Francisco",
		                                                     "Austin",
		                                                     "Denver",
		                                                     "Raleigh",
		                                                     "New York City"
		                                                    ));

		//to add multiple elements to an existing List
		cities2.addAll(Arrays.asList("Austin", "Chicago", "Houston", "Nashville"));
	}
}
