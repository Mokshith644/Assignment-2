//Finding Number of times x digit occurs in a given input
package Problem_Set_2;

import java.util.Scanner;

public class Question23 {
	public static int count(int num,int dig) {
		int res=0;
		while(num>0) {
			int temp=num%10;
			if(temp==dig)res++;
			num/=10;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("Enter the digit: ");
		int dig=sc.nextInt();
		System.out.println("The digit "+dig+" is repeated "+count(num,dig)+" times in the number "+num);

	}

}
