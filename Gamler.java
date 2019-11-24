
package CodingTest.Day1;

public class Gamler {
	public static void main(String[] args) {
		gablerSumilator(30,50,5);
	}

	private static void gablerSumilator(int stake, int goal, int trials) {
		int bets = 0 ;
		int wins = 0;
		for (int t = 0; t < trials; t++) {
			int cash = stake;
			while(cash >0 && cash <goal) {
				bets++;
				if(Math.random()<0.5) 
					cash++;
				else
					cash--;
		
			}
			if(cash == goal)
				wins++;
		}
				System.out.println("Total number of bets =" +bets);
				System.out.println("Percent of game won =" + 100.0 * wins/trials );
				System.out.println("Percent of games lose =" +100.0 *(trials-wins)/trials);
		
	}
	

}
