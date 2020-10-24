package day2;

public class DemoMachine {
	
	public static void main(String[] args) {
		
		Machine mac = new Machine(6000);
		
		mac.engineSize = 1000;
		
		mac.start();
		
		mac.stop();
		
		//--------------------------------------------
		
		Car alto = new Car();
		
		alto.start();
		
		alto.stop();
		
		alto.restart();
		
		//--------------------------------------------
		
		
		//bmw will have access to only Machine class methods and variables
		Machine bmw;
		
		bmw = new Car();
		
		bmw.engineSize = 500;
		
		bmw.start();
		
		bmw.stop();
		
		
		
		
		
		
	}

}
