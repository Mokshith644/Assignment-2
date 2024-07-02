//Permutations in which n people can occupy r seats in a classroom 
package Problem_Set_2;

import java.util.Scanner;

public class Question13 {
	public static int factorial(int n) {
		if(n==0)return 1;
		return n*factorial(n-1);
	}
	public static double permutation(int n, int r) {
		int num=factorial(n);
		int den=factorial(n-r);
		return num/den;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of people: ");
		int p=sc.nextInt();
		System.out.println("Enter the number of seats: ");
		int r=sc.nextInt();
		System.out.println("Permutations in which "+p+" people can occupy "+r+" seats in a classroom is: "+permutation(p,r));

	}

}
