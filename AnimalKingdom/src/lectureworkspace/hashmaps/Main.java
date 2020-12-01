package lectureworkspace.hashmaps;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class Main
{
	public static void main(String[] args)
	{
		// declare a map called cities with keys being Strings, values being integers.
		Map<String, Integer> cities = new HashMap<>();

		/*
		 put a new key, val pairs into the HashMap

		 three different put methods:

		 ** put(K key, V value)
		 if `key` is already associated with any `value`, this returns the previously associated value
		 if `key` is NOT associated with any `value`, returns `null`
		 note: if `key` is previously associated with a `null` value, then this will still return `null`

		 if `key` already exists in map, then the associated `value` will be UPDATED to match given V val argument


		 ** putAll(Map m)
		 takes a single parameter of type Map that contains mappings to be inserted into the hashmap
		 does not return anything

		 ** putIfAbsent(K key, V value)
		 takes a K,V pair
		 operates exactly the same as `put(K key, V value)`, but instead of UPDATING when the given `key` is already
		 associated with a value, it will NOT UPDATE if the key exists and is associated with a value.

		 So, add this K,V to the map if there is no V associated with given K.
		 Do nothing to the map if there IS a V associated with given K
		*/

		cities.put("Lehi", 62712);
		cities.put("Seattle", 724745);
		cities.put("San Francisco", 884363);
		cities.put("Austin", 100000);
		cities.put("Denver", 619968);
		cities.put("Raleigh", 464758);
		cities.put("New York City", 8623000);

		Map<String, Integer> cities2 = new HashMap<>(Map.ofEntries(entry("Lehi", 62712),
		                                                           entry("Seattle", 724745),
		                                                           entry("San Francisco", 884363),
		                                                           entry("Austin", 100000),
		                                                           entry("Denver", 619968),
		                                                           entry("Raleigh", 464758),
		                                                           entry("New York City", 8623000)
		                                                           ));
		System.out.println(cities);
		System.out.println(cities2);


	}


}
