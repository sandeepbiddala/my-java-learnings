package javaconcepts;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	public AgeComparator() {
		
	}

	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getAge() > emp2.getAge()) return 1;
		if(emp1.getAge() < emp2.getAge()) return -1;
		else return 0;
	}

}
