//Binary to decimal conversion using recursion
package Problem_Set_2;

import java.util.Scanner;

public class Question4 {
	public static int bintodec(String s, int i, int res) {
		if(i==s.length())return res;
		if(s.charAt(i)=='1')res+=Math.pow(2, s.length()-i-1);
		return bintodec(s,i+1,res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		String s=sc.next();
		int res=0;
		System.out.println("Decimal equivalent of "+s+" is: "+bintodec(s,0,res));
		
	}

}
