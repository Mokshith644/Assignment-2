//Maximum number of handshakes
package Problem_Set_2;

import java.util.Scanner;

public class Question14 {
	public static int factorial(int n) {
		if(n==0)return 1;
		return n*factorial(n-1);
	}
	public static int handshakes(int n) {
		int num=factorial(n);
		int den=factorial(n-2)*2;
		return num/den;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of people in the room: ");
		int n=sc.nextInt();
		System.out.println("Maximum possible handshakes with "+n+" people are: "+handshakes(n));
	}

}
