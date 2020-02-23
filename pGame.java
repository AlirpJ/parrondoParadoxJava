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
public class pGame {
	static double initialBal = 100;
	Random rand1 = new Random();
	double balance;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance >= 0) {
			this.balance = balance;
		}
		else {
			this.balance = 0;
		}
	}
	
	public pGame(double b) {
		setBalance(b);
		initialBal = balance;
	}
	public pGame() {
		setBalance(0);
		initialBal = 100;
	}
	
	Random rand = new Random();
	
	// Methods:
	// Game A: 49.5% chance of winning. A win will result in balance increasing by $1, and a loss will result in balance decreasing by $1
	public void gameA() {
		int chance = (rand.nextInt(1001));
		if(chance <= 495) {
			balance += 1;
		}
		else {
			balance -= 1;
		}
		//System.out.println("Game A played. \nBalance is: " + balance);
	}
	// Game B: If balance is divisible by 3, play losing coin. Otherwise, play winning coin
	public void gameB() {
		if(balance % 3 == 0) {
			if(coinL()) {
				balance+=1;
			}
			else {
				balance+=1;
			}
		}
		else {
			if(coinW()) {
				balance+=1;
			}
			else {
				balance+=1;
			}
		}
		//System.out.println("Game B played. \nBalance is: " + balance);
	}
	// CoinL has a 0.095% chance of winning
	public boolean coinL() {
		int chance = rand.nextInt(1001);
		if(chance <=95) {
			return true;
		}
		else {
			return false;
		}
	}
	// CoinW has a 79.5% chance of winning
	public boolean coinW() {
		int chance = rand.nextInt(1001);
		if(chance <=795) {
			return true;
		}
		else {
			return false;
		}
	}	
	
	

	public double parrondoSim(double run) {
		int i = 0;
	for(i = 0; i<=run; i++) {	
		//System.out.println("Run #"+(i));
		int x = rand1.nextInt(101);
		if(x >= 50) {
			gameA();
		}
		else {
			gameB();			
		}
		
	}
	double output = Math.abs(initialBal - balance);
	i = i-1;
	System.out.println("\n You gained " + output + " dollars after " + (i) + " games played!");
	System.out.println("Average gain per game: " + (output/i));
	return output;
	}
	
	
}
