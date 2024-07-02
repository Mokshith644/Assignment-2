//Number of days in a given month in a year
package Problem_Set_2;

import java.util.Scanner;

public class Question22 {
	public static boolean isLeap(int n) {
		if(n%4==0 && n%100!=0 || n%400==0)return true;
		return false;
	}
	public static int numofdays(int year, int month) {
		if(month==1 || month==3 ||month==5|| month==7 || month==8 || month==10 || month==12)return 31;
		else if(month==2) {
			if(isLeap(year))return 29;
			else return 28;
		}
		else return 30;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=sc.nextInt();
		System.out.println("Enter the month: ");
		System.out.println("Press 1 for January: ");
		System.out.println("Press 2 for February: ");
		System.out.println("Press 3 for March: ");
		System.out.println("Press 4 for April: ");
		System.out.println("Press 5 for May: ");
		System.out.println("Press 6 for June: ");
		System.out.println("Press 7 for July: ");
		System.out.println("Press 8 for August: ");
		System.out.println("Press 9 for September: ");
		System.out.println("Press 10 for October: ");
		System.out.println("Press 11 for November: ");
		System.out.println("Press 12 for December: ");
		int month=sc.nextInt();
		System.out.println("Number of days int the given month of "+year+" is: "+numofdays(year,month));

	}

}
