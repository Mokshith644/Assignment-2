//Decimal to Hexadecimal
package Problem_Set_2;

import java.util.Scanner;

public class Question9 {
	public static void dectohex(int n) {
		int[] hex=new int[100];
		int i=0;
		while(n>0) {
			hex[i]=n%16;
			n/=16;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			if(hex[j]>9)System.out.print((char)(55+hex[j]));
			else System.out.print(hex[j]);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		int n=sc.nextInt();
		System.out.println("Hexadecimal Equivalent of "+n+" is: ");
		dectohex(n);
	}

}
