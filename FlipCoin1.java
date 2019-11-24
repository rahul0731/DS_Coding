package CodingTest.Day1;
import java.util.Random;
public class FlipCoin1 {
	public static void main(String[] args) {
		flipCoin(100);
	}

	private static void flipCoin(int noOfTimes) {
		// TODO Auto-generated method stub
		int countHead = 0 , countTail=0;
		float percentH, percentT;
		for(int i=0 ; i< noOfTimes ;i++) { 
			if(Math.random() < 0.5) {
				System.out.println("Head");
				countHead++;
			}
			else {
				System.out.println("Tail");
				countTail++;
			}
		}
		//Calculating percentage
		percentH = (countHead * 100)/noOfTimes;
		percentT = (countTail *100)/noOfTimes;
		System.out.println("Percentage of tails :" +percentT + "\nPercentage of Heads  : " + percentH);
		
	}
	
}
