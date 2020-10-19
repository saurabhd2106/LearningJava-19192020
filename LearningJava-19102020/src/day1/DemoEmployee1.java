package day1;

public class DemoEmployee1 {

	public static void main(String[] args) {
		Employee1 prerna;
		
		prerna = new Employee1();
		
		prerna.setSalary(128321);
		
		prerna.setBonus(89000);
		
		int salary = prerna.calculateSalary();
		
		System.out.println("Prerna's Salary = "+ salary);

	}

}
