package Problem_Set_2;

import java.util.Scanner;

public class Question12 {
	public static void checkQuadrant(int x, int y) {
		if(x>0 && y>0)System.out.println("1st Quadrant");
		else if(x>0 && y<0)System.out.println("2nd Quadrant");
		else if(x<0 && y<0)System.out.println("3rd Quadrant");
		else if(x<0 && y>0)System.out.println("4th Quadrant");
		else System.out.println("Points are at the origin");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x coordinate: ");
		int x=sc.nextInt();
		System.out.println("Enter the y coordinate: ");
		int y=sc.nextInt();
		checkQuadrant(x,y);

	}

}
