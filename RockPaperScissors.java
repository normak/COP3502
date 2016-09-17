import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random= new Random();

		
		
		int uwins = 0;
		int cwins = 0;
		
		for (int i = 1000000; i>0; i--) {
			System.out.print("Rock = 0, Paper = 1, Scissors = 2, Exit = 1337: ");
			int uchoice = input.nextInt();
			int cchoice = random.nextInt(3);
			if (uchoice == 0 && cchoice == 1) {
				System.out.println("Computer chose paper. You lose!");
				cwins++;
				System.out.println("User wins: "+uwins+"\tComputer wins: "+cwins+"\n");
			}
			else if (uchoice == 0 && cchoice == 2) {
				System.out.println("Computer chose scissors. You win!");
				uwins++;
				System.out.println("User wins: "+uwins+"\tComputer wins: "+cwins+"\n");
			}
			else if (uchoice == 1 && cchoice == 0) {
				System.out.println("Computer chose rock. You win!");
				uwins++;
				System.out.println("User wins: "+uwins+"\tComputer wins: "+cwins+"\n");
			}
			else if (uchoice == 1 && cchoice == 2) {
				System.out.println("Computer chose scissors. You lose!");
				cwins++;
				System.out.println("User wins: "+uwins+"\tComputer wins: "+cwins+"\n");
			}
			else if (uchoice == 2 && cchoice == 0) {
				System.out.println("Computer chose rock. You lose!");
				cwins++;
				System.out.println("User wins: "+uwins+"\tComputer wins: "+cwins+"\n");
			}
			else if (uchoice == 2 && cchoice == 1) {
				System.out.println("Computer chose paper. You win!");
				uwins++;
				System.out.println("User wins: "+uwins+"\tComputer wins: "+cwins+"\n");
			}
			else if (uchoice == 1337) {
				System.out.println("Final score: \nUser wins: "+uwins+"\tComputer wins: "+cwins);
				break;
			}
			else if (uchoice == cchoice) {
				System.out.println("Computer chose the same as you. It's a tie!"+"\n");
			}
			else {
				System.out.println("Error. You can't do that.");
			}
		}
	}
}
