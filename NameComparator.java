package javaconcepts;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	public NameComparator() {
		
	}

	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.getName().compareTo(emp2.getName());
	}

}
