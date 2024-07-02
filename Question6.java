//Hexadecimal to decimal
package Problem_Set_2;

import java.util.Scanner;

public class Question6 {
	public static int hextodec(String s) {
		int res=0;
		int base=1;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				res+=(s.charAt(i)-48)*base;
				base*=16;
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='F') {
				res+=(s.charAt(i)-55)*base;
				base*=16;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hexadecimal number: ");
		String s=sc.next();
		System.out.println("Decimal equivalent of "+s+" is: "+hextodec(s));
		

	}

}
