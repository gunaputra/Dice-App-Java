package Latihan2;
import java.util.Random;

public class DiceGame {	
	public static void main (String [] args) {
		int dice1, dice2, totalDice; 
		Random a = new Random(); 
		dice1 = a.nextInt(6);
		dice1++;
		
		dice2 = (int) (6*Math.random()+1);
		dice2++;
		
		totalDice = dice1+dice2;
		
		System.out.println("Dice 1: " + dice1);
		System.out.println("Dice 2: " + dice2);
		System.out.println("Total: " + totalDice);
		
	}

}
