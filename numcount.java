import java.util.Scanner;
public class numcount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 1;
		int counter = 0;
		int g = 1;
		int[] list = new int[100];
		System.out.print("Enter some integers. Enter 0 when finished.");
		for (int x = 0; x <= 100; x++) {
			list[x]=input.nextInt();
			if (list[x] == 0) {
				break;
			}
		}
		int[] totals = counteach(list);
		for (int y = 0; y <9; y++) {
			int total = totals[y+1];
			System.out.print((y+1)+" was entered "+total);
			if (total == 0 || total > 1) {
				System.out.print(" times.");
				System.out.println();
			}
			if (total == 1) {
				System.out.print(" time.");
				System.out.println();
			}
		;
		}
	}
	public static int[] counteach(int[] x) {
		int count[] = new int[10];
		int amount = 0;
			for (int w = 0; w < x.length; w++) {
				amount = x[w];
				count[amount]++;
			}
		return count;
	}
}
