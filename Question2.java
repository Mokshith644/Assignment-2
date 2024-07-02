//LCM of 2 numbers
package Problem_Set_2;

import java.util.Scanner;

public class Question2 {
	public static int gcd(int a, int b) {
		if(b==0)return a;
		else return gcd(b,a%b);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		System.out.println("LCM of "+a+" and "+b+" is: "+(a*b)/gcd(a,b));

	}

}
