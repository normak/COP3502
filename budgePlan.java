import java.util.Scanner;
public class budgePlan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] budget = new double[12][6];
		System.out.println("\tRent\tPhone\tFood\tElectric\tInternet\tCable");
		for (int r = 0; r < budget.length; r++) {
			budget[r][0] = 500;
		}
		for (int r = 0; r < budget.length; r++) {
			budget[r][1] = 40;
		}
//Food
		budget[0][2] = 500;
		budget[1][2] = 600;
		budget[2][2] = 575;
		budget[3][2] = 400;
		budget[4][2] = 475;
		budget[5][2] = 450;
		budget[6][2] = 400;
		budget[7][2] = 625;
		budget[8][2] = 700;
		budget[9][2] = 725;
		budget[10][2] = 700;
		budget[11][2] = 800;
//Electric bill
		budget[0][3] = 50;
		budget[1][3] = 50;
		budget[2][3] = 60;
		budget[3][3] = 65;
		budget[4][3] = 70;
		budget[5][3] = 70;
		budget[6][3] = 80;
		budget[7][3] = 85;
		budget[8][3] = 80;
		budget[9][3] = 70;
		budget[10][3] = 60;
		budget[11][3] = 60;
//Internet
		for (int r = 0; r < budget.length; r++) {
			budget[r][4] = 30;
		}
//Cable
		for (int r = 0; r < budget.length; r++) {
			budget[r][5] = 25;
		}
		double incomeNeeded = moneyNeeded(budget);
		for (int r = 0; r < budget.length; r++) {
         for (int c = 0; c < budget[r].length; c++) {
				if(c % 6 == 0) {
					System.out.println("\t");
				}
				if(c==0) {
				System.out.print((r+1)+"\t");
				}
				System.out.print(budget[r][c] +"\t");
         }
      }
		double each[] = amountEachMonth(budget);
		System.out.println();
      System.out.println("Income needed for next year: "+incomeNeeded);
		System.out.println("Costs for each month:");
		System.out.println("Jan.   Feb.   Mar.   Apr.   May   Jun.   Jul.   Aug.   Sep.   Oct.   Nov.   Dec.");
		for (int r = 0; r < budget.length; r++) {
			System.out.print(each[r] + " ");
		}
		bestMonth(each);
	}
	
	public static double moneyNeeded(double[ ][ ] a) {
		double total = 0;
		for (int r = 0; r < a.length; r++) {
         for (int c = 0; c < a[r].length; c++) {
            total += a[r][c];
         }
      }
      return total;
   }
	public static double[] amountEachMonth(double[ ][ ] a) {
		double[] eachMonth = new double[12];
		for (int r = 0; r < a.length; r++) {
         for (int c = 0; c < a[r].length; c++) {
            eachMonth[r] += a[r][c];
         }
      }
		return eachMonth;
   }
		
	public static void bestMonth(double[ ] a) {
		double lowest = 1200;
		int lowestMonth = 0;
		for (int r = 0; r < a.length; r++) {
			if (a[r] < lowest) {
				a[r] = lowest;
			}
			for (int i = 0; i < a.length; i++) {
				if(a[i] == lowest) {
					lowestMonth = i;
				}
			}
		}
		System.out.println();
		System.out.println("Month "+lowestMonth+" is the month you can spend the most.");
	}
}
