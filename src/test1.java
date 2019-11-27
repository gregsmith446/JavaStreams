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
		long result = Stream.of("Abijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> 
		{
			s.startsWith("A");
			return true; // if false, terminal operation below; .count() will not run
		}
		).count();
					
		System.out.println(result);	
	}
	
}





























