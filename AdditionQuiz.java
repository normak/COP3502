import java.util.Scanner;
import java.util.Random;
public class SumCalc{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
Random random = new Random();
int addition = random.nextInt(100-51) + 52;
int Addition = random.nextInt(100-51) + 52;
int result = addition + Addition;
System.out.println(+addition);
System.out.println("+" +Addition);
System.out.println("is equal to what?");
int response = input.nextInt();
if (response == result){
System.out.println("Correct! Good job.");}
if (response != result){
System.out.println("Incorrect. ):");}
}
}
