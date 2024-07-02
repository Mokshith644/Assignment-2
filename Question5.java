//Octal to Decimal
package Problem_Set_2;

import java.util.Scanner;

public class Question5 {
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

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Octal number: ");
		int oct=sc.nextInt();
		System.out.println("Decimal equivalent of "+oct+" is: "+octtodec(oct));

	}

}
