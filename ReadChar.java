import java.util.Scanner;
public class ReadChar{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a character: ");
		String s = input.next();
		char c = s.charAt(0); 		
		System.out.println("The character entered is " +c);
	}
}

