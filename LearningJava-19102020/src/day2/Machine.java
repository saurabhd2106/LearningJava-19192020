package day2;

public class Machine {
	
	public Machine() {
		System.out.println("Machine level constructor");
	}
	
	public Machine(int engineSize) {
		
		this.engineSize = engineSize;
		
		System.out.println("Machine level constructor");
	}
	
	int engineSize;
	
	protected int capSize;
	
	public void start() {
		System.out.println("Start");
	}

	protected void stop() {
		System.out.println("Stop");
	}

}
