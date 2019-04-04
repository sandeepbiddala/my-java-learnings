package employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestGeek {

	public static void main (String[] args) 
		{ 
			
			// creating two Objects with 
			// same state 
			Geek g1 = new Geek("aditya", 1); 
			Geek g2 = new Geek("aditya", 1); 
			
			List<Geek> al = new ArrayList<Geek>();
			
			al.add(g1);
			al.add(g2);	
			
			for(Geek geek : al) 
			{ 
				System.out.println(geek); 
			} 

						
			Set<Geek> set = new HashSet<Geek>(al); 
			
			
			for(Geek geek : set) 
			{ 
				System.out.println(geek); 
			} 

		} 

}
