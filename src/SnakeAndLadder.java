import java.util.*;
import java.lang.*;
public class SnakeAndLadder {

	public static void main(String[] args) {
		// Use Case - 1
		int player1 = 0;
		int player1cnt = 0;
		ArrayList<Integer> positions = new ArrayList<Integer>(); 
		while(true) {			
			if(player1 == 100) {
				break;
			}
			else {
				// Use Case - 2
				int max = 6;
				int min = 1;
				int roll = (int) Math.floor(Math.random()*(max-min+1)+min);
				int optionPlay = (int) Math.floor(Math.random()*(2-0+1)+0);
				player1cnt += 1; 
				
//				System.out.println(roll);
//				System.out.println(optionPlay);
//				player1 = 100;
				// Use Case - 3 & 5
				switch(optionPlay) {
					
				case 0: 
					if((player1 + roll)<=100) {
						player1+=roll;
						
					}
				
				case 1: 
					if((player1 + (roll*2))<100) {
						player1+=roll*2;
					}
				
				case 2: player1 = player1;
					
				}
				// Use Case - 4
				if(player1 < 0) {
					player1 = 0;
				}
				System.out.println(roll + " " + optionPlay);
				System.out.println("player1 Position "+player1);
				positions.add(player1);
			}
		}
		System.out.println("Player1 is winner");
		System.out.println("Number of rolls required to win were "+ player1cnt);
	}
}
