import java.util.Scanner;
public class DispAscii{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer between 0 and 127: ");
int n = input.nextInt();
char N = (char) +n;
System.out.println("In ASCII, that is the character: " + N);
}
}
