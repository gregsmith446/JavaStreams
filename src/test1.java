import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

// given a list of names, count how many start with "A"

public class test1 {
	
	@Test
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
		
		// make list stream compatible -> .stream()
		// perform intermediate operation -> .filter()
		// perform terminal operation to get result -> .count()
		// the terminal operation only runs if the intermediate operation returns true
		Long count = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(count);	
		
		
		
		
		
	}
	
}





























