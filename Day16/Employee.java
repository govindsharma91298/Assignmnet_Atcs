package Day16;

import java.util.*;
import java.util.function.Predicate;

class Emp {

	String ename;
	int salary;

	public Emp() {

	}

	public Emp(String ename, int salary) {
		this.salary = salary;
		this.ename = ename;
	}

	public String toString() {
		return ename + "" + salary;
	}

}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> ar = new ArrayList<Emp>();
		ar.add(new Emp("jash", 110000));
		ar.add(new Emp("aj", 6000));
		ar.add(new Emp("manan", 7000));
		ar.add(new Emp("anmol", 5000));
		for (Emp e : ar) {
			Predicate<Emp> p2 = a -> e.salary > 7000;

			System.out.println(p2.test(e));
		}
	}

}


