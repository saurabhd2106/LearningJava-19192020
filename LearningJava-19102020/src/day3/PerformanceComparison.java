package day3;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceComparison {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		LinkedList<Integer> linkedList = new LinkedList<>();

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 10E5; i++) {

			arrayList.add(0, i);

		}

		long endTime = System.currentTimeMillis();
		
		System.out.println("Time in adding arraylist - " + (endTime - startTime) + " ms");

		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10E5; i++) {

			linkedList.add(0, i);

		}

		endTime = System.currentTimeMillis();
		
		System.out.println("Time in adding linked list - " + (endTime - startTime)+ " ms");
	}

}
