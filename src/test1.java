import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

// given a list of names, count how many start with "A"

public class test1 {
	
	public void regular()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		int count = 0;
		
		for (int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			if (name.startsWith("A"))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}	
	
	public void streamFilter()
	{						
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		// print all names longer than 4 chars
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		// find all names longer than 4 chars but only print the first one found
		names.stream().filter(s -> s.length() > 4 ).limit(1).forEach(s -> System.out.println(s));	
	}

	@Test
	public void streamMap()
	{
		// print names that ends in "a" and into upper case
		/*
		Stream.of("Abijeet", "Don", "Alekhya", "Adam", "Rama")
		.filter(s -> s.endsWith("a"))
		.map(s -> s.toUpperCase())
		.forEach(s -> System.out.println(s));		
		*/
	
		// find names with first letter "a", convert into upper case, sort into alphabetical order, and PRINT
		Stream.of("Azbijeet", "Don", "Alekhya", "Adam", "Rama")
		.filter(s -> s.startsWith("A"))
		.sorted()
		.map(s -> s.toUpperCase())
		.forEach(s -> System.out.println(s));
	}
}





























