import java.util.*;
import java.lang.*;
public class SnakeAndLadder {

	public static void main(String[] args) {
		// Use Case - 1
		int player1 = 0;
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
//				System.out.println(roll);
//				System.out.println(optionPlay);
//				player1 = 100;
				// Use Case - 3
				switch(optionPlay) {
					
				case 0: player1 += roll;
				
				case 1: player1 += roll*2;
				
				case 2: player1 = player1;
					
				}
				// Use Case - 4
				if(player1 < 0) {
					player1 = 0;
				}
			}
		}
	}
}
