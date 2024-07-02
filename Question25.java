//Roots of quadratic equation
package Problem_Set_2;

import java.util.Scanner;

public class Question25 {
	public static void roots(int a, int b, int c) {
		int dis=(b*b-(4*a*c));
		double r1,r2;
		if(dis==0) {
			System.out.println("The equation has a single repeated real root");
			r1=-b/(2*a);
			System.out.println("The root is: "+r1);
		}
		if(dis>0) {
			System.out.println("The equation has 2 distinct real roots");
			r1=(-b+Math.sqrt(dis))/(2*a);
			r2=(-b-Math.sqrt(dis))/(2*a);
			System.out.println("Two distinct roots are "+r1+" and "+r2);
		}
		else {
			System.out.println("The equation has 2 distinct complex roots");
			int real=-b/(2*a);
			System.out.println("The complex roots are "+real+" + i"+Math.sqrt(Math.abs(dis))/(2*a)+" and "+ real+" - i"+Math.sqrt(Math.abs(dis))/(2*a));
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a,b,c in the quadratic equation ax^2 + bx + c=0");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("The roots of the given quadratic equation are: ");
		roots(a,b,c);

	}

}
