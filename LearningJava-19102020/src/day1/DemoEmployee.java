package day1;

public class DemoEmployee {

	public static void main(String[] args) {
		
		Employee vivek = new Employee(80000, 70000);
		
		vivek.calculateSalary();
		
		System.out.println("-------------------------------------");

		Employee saurabh;

		saurabh = new Employee();

		saurabh.salary = -700000;

		saurabh.bonus = 8000;

		saurabh.calculateSalary();

		Employee ankit = new Employee();

		ankit.salary = 8423784;
		ankit.bonus = 4365;

		int salary = ankit.calculateSalary(238475, 4837);
		
		

		System.out.println("Ankit salary - " + salary);

		Employee akash = new Employee();

		int akashSalary = akash.calculateSalary(4687345, 483654);

		System.out.println("Akash salary - " + akashSalary);

	}

}
