import java.util.*;
import java.lang.*;
public class SnakeAndLadder {

	public static void main(String[] args) {
		int player1 = 0;
		while(true) {			
			if(player1 == 100) {
				break;
			}
			else {
				int max = 6;
				int min = 1;
				int roll = (int) Math.floor(Math.random()*(max-min+1)+min);
				int optionPlay = (int) Math.floor(Math.random()*(2-0+1)+0);
				System.out.println(roll);
				System.out.println(optionPlay);
				player1 = 100;
//				switch(roll) {
//					
//					
//				}
			}
		}
	}
}
