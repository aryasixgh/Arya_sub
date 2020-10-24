package Projects;
//author Arya Singh

import java.util.*;

public class Prob2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		Vector<Integer> fin = new Vector<Integer>();
		int n = sc.nextInt();
		fin.addElement(n);
		while (n > 1 && n < Math.pow(10, 6)) {

			if (n % 2 == 0) {
				n /= 2;
				fin.addElement(n);
			} else {
				n = (n * 3) + 1;
				fin.addElement(n);
			}
		}
		for (int i = 0; i < fin.size(); i++) {
			System.out.print(fin.elementAt(i)+" ");
		}
	}

}
