import java.util.Scanner;
public class testDisplayPattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int n = input.nextInt();
		displayPattern(n);
	}
	
	public static void displayPattern(int n) {
		int pattern = n-n+1;
		int x = 1;
		int row =0;
		int num = n;
		int space = n-1;
			for (row = 0; row < n; row++) {
				System.out.println();
				for (num = n+2; num>0; num--) {
					for (space=n-10; space >= 0; space--) {
						
						System.out.print(" ");
					}
					if (row>num){
					System.out.print(num + " ");}
				}
			System.out.println();
			}
	}
}
