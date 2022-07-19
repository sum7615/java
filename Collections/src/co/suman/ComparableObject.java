package co.suman;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import co.suman.people.Employee;

public class ComparableObject {

	public static void main(String[] args) {
		Employee e1= new Employee(698698,"Suman",54.54);
		Employee e2 = new Employee(6465,"Shrini",548.8);
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(152,"Suman",455.54));
		list.add(new Employee(589,"Shrini",487.54));
		list.add(new Employee(7895,"rajesh",684.54));
		list.add(new Employee(8787,"aayush",3461.54));
		
		Collections.sort(list); //this need comparable to implement in the employee class
		
		for(Employee e:list){   //though it is an array list it's need loop to traverse the elements
			System.out.println(e);   //employee class has to string to print the value
		}
		if(e1.compareTo(e2)<0) {
			System.out.printf("%s Joined before %s",e1.getName(),e2.getName());
		}else if(e1.compareTo(e2)>0) {
			System.out.printf("%s Joined after %s",e1.getName(),e2.getName());
		}else {
			System.out.printf("%s and %s joined togather",e1.getName(),e2.getName());
		}
		}
	}

