package CodingTest.Day2;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int range = (int) (Math.pow(2, n));
		System.out.println("Guess number between '0' to " + range);
		int lower = 0;
		int upper = range;
		int middle = (lower + upper / 2);
		GuessNumber.binarySearch(lower, upper, middle, n);

	}

	private static void binarySearch(int lower, int upper, int middle, int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is your number:" + middle);
		System.out.println();
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		String input = sc.next();
		int count = 0;
		do {
			if (input.equals("high")) {
				lower = middle;
				count++;
			} else if (input.equals("yes")) {
				System.out.println("The number you thought was: " + middle);
				break;
			} else if (input.equals("low")) {
				upper = middle;
				count++;
			}
			if (count <= n) {
				middle = (lower + upper + 1) / 2;
				System.out.println("Is your number " + middle + ":");
				input = sc.next();
			}
		} while (lower <= upper);

	}

}
/*
 * static int count =0 ; static Scanner in = new Scanner(System.in); public
 * static void main(String[] args) { System.out.println("Enter the number :");
 * int n = in.nextInt(); System.out.print("Guess one number b/w 0 to " +
 * Math.pow(2, n));
 * 
 * int gn = binarySearch(0, (int)Math.pow(2,n); }
 */
 
