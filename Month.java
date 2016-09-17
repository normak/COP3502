import java.util.Scanner;
public class Month {
	public static void main(String[] args) {
		int month = 13;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a month: ");
		String monthresult = input.next();
		switch (monthresult){
			case "January":
			month = 1;
			break;
			case "February":
			month = 2;
			break;
			case "March":
			month = 3;
			break;
			case "April":
			month = 4;
			break;
			case "May":
			month = 5;
			break;
			case "June":
			month = 6;
			break;
			case "July":
			month = 7;
			break;
			case "August":
			month = 8;
			break;
			case "September":
			month = 9;
			break;
			case "October":
			month = 10;
			break;
			case "November":
			month = 11;
			break;
			case "December":
			month = 12;
			break;
default:
System.out.println("Input error.");
}
System.out.println(monthresult + " is represented by the number "+month);
int days = 0;
if (month == 1){
days = 31;}
else if (month == 2){
days = 28;}
else if (month == 3){
days = 31;}
else if (month == 4){
days = 30;}
else if (month == 5){
days = 31;}
else if (month == 6){
days = 30;}
else if (month == 7){
days = 31;}
else if (month == 8){
days = 31;}
else if (month == 9){
days = 30;}
else if (month == 10){
days = 31;}
else if (month == 11){
days = 30;}
else if (month == 12){
days = 31;}
System.out.println(monthresult+" has "+days+" days.");
}
}



