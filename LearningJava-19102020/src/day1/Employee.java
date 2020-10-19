package day1;

public class Employee {

	int salary;

	int bonus;
	
	public Employee() {
		salary = 50000;
		
		bonus = 6000;
	}
	
	public Employee(int salary, int bonus) {
		
		this.salary = salary;
		
		this.bonus = bonus;
	}

	void calculateSalary() {

		// local variable
		int totalSalary;

		totalSalary = salary + bonus;

		System.out.println("Total Salary - " + totalSalary);
	}

	int calculateSalary1() {

		// local variable
		int totalSalary;

		totalSalary = salary + bonus;

		return totalSalary;

	}
	
	
	//argument level variable
	int calculateSalary(int salary, int bonus) {

		// local variable
		int totalSalary;

		totalSalary = this.salary + bonus;

		return totalSalary;
	}

}
