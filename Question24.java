//Finding number of integers in a range which has exactly x divisors
package Problem_Set_2;

import java.util.Scanner;

public class Question24 {
	public static int count(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)count++;
		}
		return count;
	}
	public static int countdivisor(int s, int e, int x) {
		int res=0;
		for(int i=s;i<=e;i++) {
			if(count(i)==x)res++;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		int start=sc.nextInt();
		System.out.println("Enter the ending value: ");
		int end=sc.nextInt();
		System.out.println("Enter the required number of divisors: ");
		int x=sc.nextInt();
		System.out.println("There are "+countdivisor(start,end,x)+" numbers in the range of "+start+" - "+end+" which has exactly "+x+" divisors");
		

	}

}
