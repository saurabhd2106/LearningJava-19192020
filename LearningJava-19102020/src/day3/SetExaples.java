package day3;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExaples {

	public static void main(String[] args) {

		Set<String> userName = new HashSet<>();

		userName.add("Saurabh");
		userName.add("Gaurav");
		userName.add("Vivek");
		userName.add("Ankita");
		userName.add("Ankit");
		userName.add("Saurabh");

		for (String user : userName) {
			System.out.println(user);
		}

		System.out.println("------------------------------------------");

		Set<String> userNameLinkedSet = new LinkedHashSet<>();

		userNameLinkedSet.add("Saurabh");
		userNameLinkedSet.add("Gaurav");
		userNameLinkedSet.add("Vivek");
		userNameLinkedSet.add("Ankita");
		userNameLinkedSet.add("Ankit");
		userNameLinkedSet.add("Saurabh");

		for (String user : userNameLinkedSet) {
			System.out.println(user);
		}

		System.out.println("------------------------------------------");
		
		Set<String> userNameTreeSet = new TreeSet<>(Collections.reverseOrder());

		userNameTreeSet.add("Saurabh");
		userNameTreeSet.add("Gaurav");
		userNameTreeSet.add("Vivek");
		userNameTreeSet.add("Ankita");
		userNameTreeSet.add("Ankit");
		userNameTreeSet.add("Saurabh");

		for (String user : userNameTreeSet) {
			System.out.println(user);
		}

	}
}
