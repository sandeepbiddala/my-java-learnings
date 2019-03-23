package javaconcepts;

import java.util.ArrayList;
import java.util.Collections;

public class TestJava {
	
	
	public static void main(String[] args) {
		System.out.println("Hi Eclipse");
		
		Employee e1 = new Employee("Sandeep",24,"Senior Developer");
		Employee e2 = new Employee("Vishnu",23,"Team Lead");
		Employee e3 = new Employee("Divya",21,"Recuiter");
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		System.out.println("**********Employee Details***************");
		
		/*System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);*/
		System.out.println("----Before Sorting-----");
        System.out.println(empList);
        System.out.println("----Sort By Name-----");
		Collections.sort(empList, new NameComparator());
		System.out.println(empList);
		System.out.println("----Sort By Age-----");
		Collections.sort(empList, new AgeComparator());	
		System.out.println(empList);
	}

}
