package day2;

public class ArrayExamples {
	
	
	public static void main(String[] args) {
		
		int[] number = new int[5];
		
		number[0] = 10;
		number[1] = 15;
		number[2] = 17;
		number[3] = 18;
		number[4] = 12;
		
		for(int temp : number) {
			System.out.println(temp);
		}
		
		System.out.println(number[3]);
		
		int[] arr = {5, 6, 8, 2 , 8};
		
		for (int i=0; i< arr.length ; i++) {
			
			System.out.println(arr[i]);
		}
	}

}
