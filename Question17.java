//Number as a sum of 2 prime numbers
package Problem_Set_2;

import java.util.Scanner;

public class Question17 {
	public static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public static void primesum(int n) {
		for(int i=2;i<n;i++) {
			if(!isPrime(i))continue;
			for(int j=n-1;j>i;j--) {
				if(!isPrime(j))continue;
				else if(i+j==n)System.out.println(i+" and "+j);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		System.out.println(n+" can be expressed as the sum of ");
		primesum(n);

	}

}
