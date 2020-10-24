package Projects;
//author Arya Singh

//Increasing array

import java.util.*;

public class Prob1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int x = n;
		int count = 0;
		while (x >= 1 && x <= Math.pow(2.10, 5)) {
			for (int i = 0; i < (n - 1); i++) {
				if (arr[i + 1] < arr[i]) {
					arr[i + 1] = arr[i];
					count++;
				}
			}
			x--;
		}
		System.out.println("New Array");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nNumber of turns(or times it had to increment nums in array): " + count);

	}

}
