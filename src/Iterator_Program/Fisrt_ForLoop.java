package Iterator_Program;

import java.util.ArrayList;

public class Fisrt_ForLoop {

	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // ArrayList
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(20);
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) { // for loop
			System.out.println(list.get(i));
		}
	}
}