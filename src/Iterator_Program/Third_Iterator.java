package Iterator_Program;

import java.util.ArrayList;
import java.util.Iterator;

public class Third_Iterator {

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

		Iterator<Integer> it = list.iterator(); // Iterator method
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
