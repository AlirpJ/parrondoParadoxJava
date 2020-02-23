/*
Joshua Prila
Special thanks to Dr. Robert Ellis
Feb. 23, 2020
 
 Parrondo's Paradox: A combination of losing strategies can result in a winning strategy
 		The goal of this program is to demonstrate Parrondo's Paradox
 		This will be done by using two games that are "losing games" and show 
 		that even when played in random order, when alternated, will result in a willing result over time
 		*/
import java.util.Random;
import java.util.Scanner;
public class parrondoApp {
	
	static double initialBal = 100;
	
	public static void main(String[] args) {
		Random rand1 = new Random();
		pGame player = new pGame(initialBal); // Player with $100

		// Game A and B played sequentially
//		player.gameA();
//		for(int i = 0; i<100; i++) {
//			player.gameA();
//			player.gameB();
//			
//		}
//		
		// Random game-picking, run 200 times
		System.out.println("Enter how many runs you want to simulate: ");
		Scanner scan = new Scanner(System.in);
		double runs = scan.nextDouble();
		player.parrondoSim(runs);
		scan.close();

	
	}

}
