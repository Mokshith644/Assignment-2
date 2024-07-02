//Binary to octal
package Problem_Set_2;

import java.util.Scanner;

public class Question10 {
	public static int bintodec(String s, int i, int res) {
		if(i==s.length())return res;
		if(s.charAt(i)=='1')res+=Math.pow(2, s.length()-i-1);
		return bintodec(s,i+1,res);
	}
	public static void dectooct(int n) {
		if(n<=8) {
			System.out.print(n);
			return;
		}
		dectooct(n/8);
		System.out.print(n%8);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		String s=sc.next();
		int n=bintodec(s,0,0);
		System.out.println("Octal equivalent of "+s+" is: ");
		dectooct(n);
		

	}

}
