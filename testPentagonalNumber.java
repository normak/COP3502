public class testPentagonalNumber {
	public static void main(String[] args) {
			int g = 1;
			for (int i =0; i<100; i++) {
				if(i%10==0) {
				System.out.println();
				}
				int number = getPentagonalNumber(g);
				g++;
				System.out.print(number + " ");
			}
	}
	public static int getPentagonalNumber(int n) {
		int pentnum = n*(3*n-1)/2;
		return pentnum;
	}
}
