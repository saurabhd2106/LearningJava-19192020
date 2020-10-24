package day2;

public class WhileLoopExample {

	public static void main(String[] args) {

		int number = 8495435;

		int reverseNumber = 0;

		int temp;

		while (number != 0) {
			
			temp = number % 10;

			reverseNumber = reverseNumber * 10 + temp;

			number = number / 10;
		}

		System.out.println("Reverse Number - " + reverseNumber);
		int i = 5; 
		
		do {
			
			
			
		} while (i > 5);

	}

}
