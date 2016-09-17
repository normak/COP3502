import java.util.Scanner;
public class TwinPrimes {
	public static void main(String[] args) {
		System.out.println("The twin primes less than 1000 are: ");
			for (int number = 1; number < 1000; number++) {
				for (int count = 1; count <= 2; count++) {
					if (isPrime(number) == true && count != 2) {
						if (isPrime(number + 2) == true) {
							System.out.print("("+number+", ");
						}
					}
					if (count == 2 && isPrime(number) == true) {
						if (isPrime(number + 2) == true) {
							System.out.print(number + 2 +")");
							System.out.println();
						}
					}
				}
			}
		}
					
					


	public static boolean isPrime(int x) {
		for (int g = 2; g <= x/2; g++) {
			if (x % g == 0) {
				return false;
			}
		}
		return true;
	}
}
