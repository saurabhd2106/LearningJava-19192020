package day3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<Integer> arrayList;

		arrayList = new ArrayList<>();

		arrayList.add(34);

		arrayList.add(1, 24);

		arrayList.add(2, 24);

		arrayList.add(224);

		arrayList.add(235);
		
		System.out.println(arrayList.size());
		
		System.out.println("------------------------------------");

		for (Integer temp : arrayList) {
			System.out.println(temp);
		}
		
		System.out.println("------------------------------------");
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(34);

		linkedList.add(1, 24);

		linkedList.add(2, 24);

		linkedList.add(224);

		linkedList.add(235);
		
		System.out.println(linkedList.size());
		
		System.out.println("------------------------------------");

		for (Integer temp : linkedList) {
			System.out.println(temp);
		}

	}

}
