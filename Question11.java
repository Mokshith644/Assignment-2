//Octal to binary conversion
package Problem_Set_2;

import java.util.Scanner;

public class Question11 {
	public static int count(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	public static int octtodec(int n) {
		int res=0;
		int count=count(n);
		int i=0;
		while(n>0) {
			int temp=n%10;
			res+=temp*Math.pow(8, i);
			i++;
			n/=10;
		}
		return res;
	}
	public static void dectobin(int n) {
		if(n==1 || n==0) {
			System.out.print(n);
			return;
		}
		dectobin(n/2);
		System.out.print(n%2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the octal number: ");
		int n=sc.nextInt();
		System.out.println("Binary equivalent of the octal number "+n+" is:");
		dectobin(octtodec(n));
		

	}

}
