public class DisplayPiValue {
	public static void main(String[] args) {
		int i = 10;
		int g = 1;
		int h =10;
		while (g<=10) {
			double pi = pie(h);
			h+=10;
			System.out.println(i*g+"\t\t"+pi);
			g++;
		}
	}
	public static double pie(int n) {
		double x = 0;
		for (int count =1; count < n; count += 2) {
			x = x+ (1.0/(2.0*count-1))-(1.0/(2.0*count+1.0));
		}
		double value = 4 * x;
		return value;
	}
}
