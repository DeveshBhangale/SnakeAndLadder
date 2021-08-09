import java.util.*;
import java.lang.*;


public class SnakeAndLadder {

	public static void main(String[] args) {
		// Use Case - 1 & 7
		int player1 = 0;
		int player2 = 0;
		int player1cnt = 0;
	
		ArrayList<Integer> positions1 = new ArrayList<Integer>(); 
		ArrayList<Integer> positions2 = new ArrayList<Integer>(); 
		while(true) {	
			
			if(player1 == 100) {
				System.out.println("Player1 is the winner");
				// System.out.println("Number of rolls required to win were "+ player1cnt);
				break;
			}
			if(player2 == 100) {
				System.out.println("Player2 is the winner");
				// System.out.println("Number of rolls required to win were "+ player1cnt);
				break;
			}
			else {
				// Use Case - 2
				int max = 6;
				int min = 1;
				int roll1 = (int) Math.floor(Math.random()*(max-min+1)+min);
				int roll2 = (int) Math.floor(Math.random()*(max-min+1)+min);
				int optionPlay1 = (int) Math.floor(Math.random()*(2-0+1)+0);
				int optionPlay2 = (int) Math.floor(Math.random()*(2-0+1)+0);
				player1cnt += 1; 
				
//				System.out.println(roll);
//				System.out.println(optionPlay);
//				player1 = 100;
				// Use Case - 3 & 5
				// Switch case for player1
				switch(optionPlay1) {
					
				case 0: 
					if((player1 + roll1)<=100) {
						player1+=roll1;
						
					}
					break;
					
				
				case 1: 
					if((player1 + (roll1*2))<=100) {
						player1+=roll1*2;
					}
					break;
				
				case 2: player1 = player1;
					break;
					
				}
				
				// Switch case for player2
				switch(optionPlay2) {
				
				case 0: 
					if((player2 + roll2)<=100) {
						player2+=roll2;
						
					}
					break;
					
				
				case 1: 
					if((player2 + (roll2*2))<=100) {
						player2+=roll2*2;
					}
					break;
				
				case 2: player2 = player2;
					break;
					
				}
					
				// Use Case - 4
				if(player1 < 0 ) {
					player1 = 0;
				}
				if(player2 < 0) {
					player2 = 0;
				}
//				System.out.println(roll + " " + optionPlay);
//				System.out.println("player1 Position "+player1);
				positions1.add(player1);
				positions2.add(player2);
			}
		}
		
		
	}
}
