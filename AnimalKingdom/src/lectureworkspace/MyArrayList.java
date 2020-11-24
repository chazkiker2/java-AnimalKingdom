package lectureworkspace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.reverseOrder;
public class MyArrayList
{
	public static void main(String[] args)
	{
		// THE FOLLOWING IS JUST REPEATING THE ABOVE BUT IN MORE EFFICIENT WAYS :)
		// if you knew which cities you wanted to initialize the constructor with
		List<String> cities = new ArrayList<>(Arrays.asList("Lehi",
		                                                    "Seattle",
		                                                    "San Francisco",
		                                                    "Austin",
		                                                    "Denver",
		                                                    "Raleigh",
		                                                    "New York City"
		                                                   ));

		//to add multiple elements to an existing List
		cities.addAll(Arrays.asList("Austin", "Chicago", "Houston", "Nashville"));
		System.out.println(cities);

		cities.remove("Austin");
		System.out.println(cities);

		System.out.println(cities.size());


		Collections.sort(cities);
		for (int i = 0; i < cities.size(); i++)
		{
			System.out.println("Index: " + i + " Value: " + cities.get(i));
		}

		cities.set(4, "Glen Ellyn");
		System.out.println(cities);
		Collections.sort(cities);
		System.out.println(cities);
		System.out.println("cities contains 'Lehi'? " + cities.contains("Lehi"));
		System.out.println("cities contains 'Glen Ellyn'? " + cities.contains("Glen Ellyn"));

		System.out.println("in reverse order:");
		cities.sort(reverseOrder());
		for (int i = 0; i < cities.size(); i++)
		{
			System.out.println("index: " + i + " value: " + cities.get(i));
		}

		cities.clear();
		System.out.println(cities);
	}
}
