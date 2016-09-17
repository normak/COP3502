import java.util.Scanner;
public class triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the length of the base: ");
		int length = input.nextInt();
		for (int i = 0; i )
		
		for (int i = 0; i != length; i++) {
			System.out.print(" ");
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		}
	}
}