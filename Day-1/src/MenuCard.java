import java.util.Scanner;

public class MenuCard {

	public static void main(String[] args) {

		while (true) {
			System.out.println("Enter number to check Prime,Perfect,Palindrome and Amstrong or enter exit to Quit:\n");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			;
			if (input.equals("exit")) {
				break;
			}
			int dec = Integer.parseInt(input);
			if (checkPrime(dec)) {
				System.out.println(dec + " is a Prime Number");
			} else {
				System.out.println(dec + " is not a Prime Number");
			}
			if (checkPerfect(dec)) {
				System.out.println(dec + " is a Perfect Number");
			} else {
				System.out.println(dec + " is not a Perfect Number");
			}

			if (checkPalindrome(dec)) {
				System.out.println(dec + " is a Palindrome");
			} else {
				System.out.println(dec + " is not a Palindrome");
			}
			if (checkArmstrong(input)) {
				System.out.println(dec + " is a Armstrong Number");
			} else {
				System.out.println(dec + " is not a Armstrong Number");
			}
		}

	}

	public static boolean checkPrime(int a) {
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkPerfect(int a) {
		int sum = 1;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		if (sum == a) {
			return true;
		}
		return false;
	}

	public static boolean checkPalindrome(int a) {
		int sum = 0;
		int rem = 0;
		int temp = a;
		while (a > 0) {
			rem = a % 10;
			sum = sum * 10 + rem;
			a /= 10;
		}
		if (temp == sum) {
			return true;
		}
		return false;
	}

	public static boolean checkArmstrong(String a) {
		int len = a.length();
		int sum = 0;
		int num = Integer.parseInt(a);
		int temp = num;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			sum += Math.pow(rem, len);
			num /= 10;
		}
		if (sum == temp) {
			return true;
		}
		return false;
	}
}
