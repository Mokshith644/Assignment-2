//Number of digits in an integer
package Problem_Set_2;

import java.util.Scanner;

public class Question20 {
	public static int count(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		System.out.println("Number of digits in "+n+" is: "+count(n));

	}

}
