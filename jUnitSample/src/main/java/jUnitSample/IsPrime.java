package jUnitSample;

public class IsPrime {
	public static void main(String args[]) {
		int num = 9;
		boolean flag = true;
		if (doCheck(num) && num != 2)
			System.out.println("It is not prime.");
		else {
			for (int i=2; i<num/2; i++) {
				if (num % i == 0) {
					System.out.println("It is not prime.");
					flag = false;
					break;
				}
			}
		}
		if (flag)
			System.out.println("It is prime.");
	}
	
	public static boolean doCheck(int num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	}
}
