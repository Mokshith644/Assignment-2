//Binary to decimal
package Problem_Set_2;

import java.util.Scanner;

public class Question3 {
	public static int bintodec(String s) {
		int res=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1') {
				res+=Math.pow(2, s.length()-i-1);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		String s=sc.next();
		System.out.println("Decimal equivalent of "+s+" is: "+bintodec(s));

	}

}
