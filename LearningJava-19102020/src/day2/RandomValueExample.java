package day2;

import java.util.Random;

public class RandomValueExample {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numbers = new int[100];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(10);
		}
		
		int count[] = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			
			count[numbers[i]]++;
			
		}
		
		for(int temp =0; temp <count.length; temp++) {
			System.out.println("value of " + temp + " is - "+ count[temp]);
		}
		
	}

}
