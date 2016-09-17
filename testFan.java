import java.util.Scanner;
public class testFan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fan1c = "yellow";
		String fan2c = "blue";
		int fan1s = 3;
		int fan2s = 2;
		boolean fan1o = true;
		boolean fan2o = false;
		Fan fan1 = new Fan(fan1s, fan1c, fan1o);
		Fan fan2 = new Fan(fan2s, fan2c, fan2o);
		
		
		
		
		System.out.println("Fan 1:"+fan1.toString());
		
		System.out.println("Fan 2:"+fan2.toString());
	}
}
