package javvaa;

public class Print_Array {

	public static void main(String[] args) {

		int arr[] = new int[3];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		try { 								// try catch use kiya hai excaption ko handle kar ne ke liye
			for (int i = 0; i < 4; i++) { 					// using a for loop....

				System.out.println(arr[i]);
			}

		} catch (Exception e) {
			System.out.println("Size jada hai " + e);
		}

															// using a for each loop....
		System.out.println("using a for each loop....");

		for (int a : arr) {
			System.out.println(a);
		}
	}
}
