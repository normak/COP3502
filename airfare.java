import java.util.Scanner;
	public class airfare {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a child's age in years (0-17)");
		int cage = input.nextInt();
		System.out.println("Is your child traveling alone? Input Y or N.");
		String alone = input.next();
		int cost = 0;
		int num = 0;
					if (alone == "Y"){	
						if (cage < 5){
						cost += 50;}
						if (cage >= 5 && cage < 11){
						cost += 100;}
						if (cage >= 11){
						cost += 200;}
					}
					if (alone == "N"){
						if (cage < 5){
						cost += 0;}
						if (cage >= 5 && cage < 11){
						cost += 100;}
						if (cage >= 11){
						cost += 200;}
					}
			System.out.println("Do you have another child?");
				String another = input.next();
while (another == "Y") {
System.out.println("Enter a child's age in years (0-17)");
		int cage1 = input.nextInt();
		System.out.println("Is your child traveling alone? Input Y or N.");
		String alone1 = input.next();
		int num1 = 0;
				while (num==0)	{
					if (alone == "Y"){	
						if (cage < 5){
						cost += 50;}
						if (cage >= 5 && cage < 11){
						cost += 100;}
						if (cage >= 11){
						cost += 200;}
					}
					if (alone == "N"){
						if (cage < 5){
						cost += 0;}
						if (cage >= 5 && cage < 11){
						cost += 100;}
						if (cage >= 11){
						cost += 200;}
					}
}
}
System.out.println("The total cost is "+cost);
}
}
