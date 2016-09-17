import java.util.Scanner;
public class Order {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Input an integer: ");
int num1 = input.nextInt();
System.out.println("Input another integer: ");
int num2 = input.nextInt();
System.out.println("Input one more integer: ");
int num3 = input.nextInt();
if (num1 >= num2 && num2 >= num3) {
System.out.println(num1);
System.out.println(num2);
System.out.println(num3);
}
if (num1 >= num3 && num3 >= num2) {

System.out.println(num1);
System.out.println(num3);
System.out.println(num2);
}
if (num2 >= num1 && num1 >= num3) {
System.out.println(num2);
System.out.println(num1);
System.out.println(num3);
}
if (num2 >= num3 && num3 >= num1) {
System.out.println(num2);
System.out.println(num3);
System.out.println(num1);
}
if (num3 >= num2 && num2 >= num1) {
System.out.println(num3);
System.out.println(num2);
System.out.println(num1);
}
if (num3 >= num1 && num1 >= num2) {
System.out.println(num3);
System.out.println(num1);
System.out.println(num2);
}
}
}
