package Problem_Set_2;

import java.util.Scanner;

public class Question7 {
	public static void dectobin(int n) {
		for(int i=31;i>=0;i--) {
			int k=n>>i;
			if((k & 1)==1)System.out.print("1");
			else System.out.print("0");
		}
	}
	public static void dectobinrec(int n) {
		if(n==1 || n==0) {
			System.out.print(n);
			return;
		}
		dectobinrec(n/2);
		System.out.print(n%2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int n=sc.nextInt();
		dectobinrec(n);

	}

}
