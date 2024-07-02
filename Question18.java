//Area of a circle
package Problem_Set_2;

import java.util.Scanner;

public class Question18 {
	public static double area(double r) {
		return Math.PI*r*r;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double r=sc.nextDouble();
		System.out.println("Area of the circle with radius "+r+" units is: "+area(r));

	}

}
