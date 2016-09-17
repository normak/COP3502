import java.util.Scanner;
public class Creditcard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your credit card number: ");
		long CardNum = input.nextLong();
		if (isValid(CardNum) == true) {
			System.out.println("This credit card is valid.");
		}
		if (isValid(CardNum) == false) {
			System.out.println("This credit card is invalid.");
		}
	}
		


	// return true if the card number is valid
	public static Boolean isValid(long number) {
		boolean validity = (getSize(number) >= 13) && (getSize(number) <= 16) && (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37)) && (sumOfDoubleEvenPlace(number) + sumOfoddPlace(number)) % 10 == 0;
		return validity;
	}

	// get the result from Step 2
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String digit = Long.toString(number);
		for (int x = digit.length() - 2; x >-1; x-=2) {
			sum += Integer.parseInt("" + digit.charAt(x));
		}
		return sum;
	}

	// return the number if it is a single digit, otherwise, return the sum of the two digits
	public static int getDigit(int number) {
		int digit = (number % 10 + (number /10));
		return digit;
	}

	// return sum of odd place digits in number
	public static int sumOfoddPlace(long number) {
		int sum = 0;
		String digit = Long.toString(number);
		for (int x = digit.length() -1; x > 0; x -=2) {
			sum += Integer.parseInt("" + digit.charAt(x));
		}
		return sum;
	}

	// return true if the digit d is a prefix for number, e.g., prefixMatched(3788576018402626, 37) returns true
	public static boolean prefixMatched(long number, int d) {
		long prefix = getPrefix(number,(getSize(d)));
		if (d == prefix) {
			return true;
		}
		else {
			return false;
		}
	}

	// return the number of digits in d, e.g., getSize(4388576018402626) returns 16
	public static int getSize(long d) {
		int howmany = 0;
		String size = Long.toString(d);
		howmany = size.length();
		return howmany;
	}
	/* return the first k number of digits from number. If the number of digits in number is less than k, return number. E.g., getPrefix(4388576018402626, 2) returns 43*/
	public static long getPrefix(long number, int k) {
		String size = Long.toString(number);
		if (size.length() <= k) {
			return number;
		}
		else {
			return Long.parseLong(size.substring(0,k));
		}
	}
}
	
