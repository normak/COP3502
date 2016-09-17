import java.util.Scanner;
public class BadorGood {
	public static void main(String[] args) {
		int m = 0;
		char[] letters = {'s', 't', 'r', 'e', 's', 's', 'e', 'd'};
		Scanner input = new Scanner(System.in);
		System.out.print("Bad or Good (b/g)? Or press x to cancel. ");
		while (m == 0) {
		String choice = input.next();
		char choice1 = choice.charAt(0);
			if (choice1 == 'b') {
				System.out.println(letters);
				char reverse[] = badReverse(letters);
				System.out.println(reverse);
				System.out.println(letters);
			}
			if (choice1 == 'g') {
				System.out.println(letters);
				char good[] = goodReverse(letters);
				System.out.println(good);
				System.out.println(letters);
			}
			if (choice1 == 'x') {
				break;
			}
		}
	}
	
	public static char[ ] badReverse(char[ ] anArray) {
		char[] reverse = new char[anArray.length];
		for (int i = anArray.length - 1; i >= 0; i--) {
			reverse[anArray.length - 1-i] = anArray[i];
		}
		
		char[] bad = {'i', 't', 's', 'w', 'r', 'o', 'n', 'g'};
		for (int i = 0; i < anArray.length; i++) {
			anArray[i] = bad[i];
		}
		
		return reverse;
	}
		
	public static char[ ] goodReverse(char[ ] anArray) {
		char[] reverse = new char[anArray.length];
		for (int i = anArray.length - 1; i >= 0; i--) {
			reverse[anArray.length - 1-i] = anArray[i];
		}
		return reverse;
	}
}
