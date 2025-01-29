package studio2;

import java.util.Scanner;

public class Ruin {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double startAmount;
		double winChance;
		double winLimit;
		int totalSimulations;
		
		System.out.println("How much money are you bring to the Casino today? ");
		startAmount = in.nextDouble();
		System.out.println("What's your threshold of winning BIG? ");
		winChance = in.nextDouble();
		System.out.println("At what amount of money will you go home to your wife and kids? ");
		winLimit = in.nextDouble();
		System.out.println("How many days will you abandon your family? ");
		totalSimulations = in.nextInt();
		
		double initialAmount = startAmount;
		for(int i = 1; i <= totalSimulations; i++) {
			int x = 0;
			while (startAmount > 0 && (startAmount < winLimit)) {	
				if ( Math.random() > winChance) {
					startAmount--;
					x++;
				}
				else {
					startAmount++;
					x++;
				}
			}
		int j = 0;
		if (startAmount == 0) {
			System.out.println("Simulation " + i + ": " + x + " Lose");
			startAmount = initialAmount;
			j++;
		}
		else {
			System.out.println("Simulation " + i + ": " + x + " Win");
			startAmount = initialAmount;
		}
		int Losesrate = j/totalSimulations;
		}
	}
}