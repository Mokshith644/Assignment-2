//Prime numbers between 1 and 100
package Problem_Set_2;

public class Question19 {
	public static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public static void printprime() {
		for(int i=2;i<=100;i++) {
			if(isPrime(i))System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.println("Prime numbers between 1 and 100 are: ");
		printprime();

	}

}
