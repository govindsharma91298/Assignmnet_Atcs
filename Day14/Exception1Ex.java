package Day14;

import java.util.Scanner;

public class Exception1Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 no.");
		int x = sc.nextInt();

		System.out.println("Enter 2 no.");
		int y = sc.nextInt();

		try {
			int z = x / y;

			System.out.println(z);
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
