package day3;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {

			int[] arr = new int[5];

			arr[0] = 5;
			arr[1] = 5;
			arr[2] = 5;
			arr[3] = 5;
			arr[4] = 5;
			arr[5] = 5;
			
			System.out.println("after error index..");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Error occured ....");
			
			e.printStackTrace();
		}
		
		System.out.println("after catch..");

	}

}
