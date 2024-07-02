//Decimal to octal 
package Problem_Set_2;

import java.util.Scanner;

public class Question8 {
	public static void dectooct(int n) {
		if(n<=8) {
			System.out.print(n);
			return;
		}
		dectooct(n/8);
		System.out.print(n%8);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int n=sc.nextInt();
		System.out.println("Octal equivalent of "+n+" is: ");
		dectooct(n);
	}

}
