package day2;

public class Car extends Machine {

	public Car() {

		super(5000);

		System.out.println("Car level constructor");
	}

	public void restart() {

		engineSize = 4500;

		start();

		System.out.println("Restart");
	}

	public void breakingMech() {
		System.out.println("Break");
	}

	@Override
	public void stop() {
		System.out.println("Implemented in car class");
	}
}
