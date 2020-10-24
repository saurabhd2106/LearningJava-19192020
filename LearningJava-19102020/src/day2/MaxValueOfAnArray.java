package day2;

public class MaxValueOfAnArray {
	
	public static void main(String[] args) {
		
		
		int[] number = new int[5];
		
		number[0] = -19;
		number[1] = 15;
		number[2] = 17;
		number[3] = 18;
		number[4] = -121;
		
		int max = number[0];
		
		for(int num = 1; num < number.length; num ++) {
			
			if(max < number[num]) {
				
				max = number[num];
				
			}
		}
		
		System.out.println("Maximum value - "+ max);
	}

}
