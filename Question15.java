package Problem_Set_2;

import java.util.Scanner;

public class Question15 {
	public static int gcd(int a, int b) {
		if(b==0)return a;
		return gcd(b,a%b);
	}
	public static int LCM(int a ,int b) {
		return (a*b)/gcd(a,b);
	}
	public static void add(int num1,int den1,int num2,int den2) {
		int den=LCM(den1,den2);
		int c1=(num1*den)/den1;
		int c2=(num2*den)/den2;
		System.out.println(c1+c2+"/"+den);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numerator of first fraction: ");
		int num1=sc.nextInt();
		System.out.println("Enter denominator of first fraction: ");
		int den1=sc.nextInt();
		System.out.println("Enter numerator of second fraction: ");
		int num2=sc.nextInt();
		System.out.println("Enter denominator of second fraction: ");
		int den2=sc.nextInt();
		System.out.println(num1+"/"+den1+"+"+num2+"/"+den2+" = ");
		add(num1,den1,num2,den2);
	}

}
