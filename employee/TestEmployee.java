package employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestEmployee {

	public TestEmployee() {
		
	}

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Sandeep",33, "Software Developer"));
		empList.add(new Employee("Divya",29, "Tester"));
		empList.add(new Employee("Vishnu",33, "Senior Software Developer"));
		empList.add(new Employee("Sandeep",33, "Software Developer"));
		
		System.out.println("***List of Duplicate Employees****");
		for(Employee emp : empList) {
			
		System.out.println(emp);
			
		}
		
		System.out.println("****List of Employees without Duplicates*****");

		Set<Employee> empSet = new HashSet<Employee>(empList);
		
		for (Employee emp : empSet) {

			System.out.println(emp);

		}	
		
		
	}

}
