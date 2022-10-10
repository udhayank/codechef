package problems;

import java.util.Scanner;

public class BuildingRace {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		for (int t=0; t<testCases; t++) {
			
			int a = in.nextInt();
			int b = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			
			double ta = (double) a / x;
			double tb = (double) b / y;
			
			if (ta == tb) {
				System.out.println("Both");
			} else {
				String winner = ta < tb ? "Chef" : "Chefina";
				System.out.println(winner);
			}
			
		}

	}

}
