package co.suman;

import java.util.Map;
import java.util.TreeMap;

import co.suman.people.Person;

public class UsingTreeMap {

	public static void main(String[] args) {
		Map<Person, String> map = new TreeMap<Person, String>(); // person have to be compareable
		map.put(new Person("Suman","Paul"), "AMtali, Tripura");
		map.put(new Person("Rabindra","Paul"), "R.K Palli, Tripura");
		map.put(new Person("Anjana","Paul"), "Ram Krishna Palli, Tripura");
		map.put(new Person("Suman","Debnath"), "Agartala, Tripura");
		System.out.println("Size of the Map is: "+map.size());
		System.out.println(map);
	}
}
