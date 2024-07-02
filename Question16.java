//Replace all 0's with 1's in an integer
package Problem_Set_2;

import java.util.Scanner;

public class Question16 {
	public static int replace(int n) {
		int mul=1;
		int res=0;
		while(n>0) {
			int temp=n%10;
			if(temp==0) {
				res+=1*mul;
				mul*=10;
			}
			else {
				res+=temp*mul;
				mul*=10;
			}
			n/=10;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println(n+" after replacing all 0's with 1's is: "+replace(n));
		
	}

}
