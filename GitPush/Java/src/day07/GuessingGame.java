/*
 * Zheng Zhang
 * May 25, 2015
 * Letter guessing game
 */

package day07;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] chs = null;
		char[] input = null;
		int[] res = null;
		int count = 0;
		boolean jump = false;
		System.out
				.println("Welcome to letter guessing game, please input 5 letters");

		do {
			System.out.println("Please input the size of the game, 7, 8, 9");
			int arrayLength = scan.nextInt();
			switch (arrayLength) {
			case 1:
				arrayLength = 7;
				jump = true;
				break;
			case 2:
				arrayLength = 8;
				jump = true;
				break;
			case 3:
				arrayLength = 9;
				jump = true;
				break;
			default:
				jump = false;
			}
			chs = generate(arrayLength);

		} while (jump);

		System.out.println("Please input " + chs.length + " letters.");
		while (true) {

			String inputStr = scan.next().toUpperCase();
			if ("EXIT".equals(inputStr)) {
				System.out
						.println("Thank you for trying Guessing Game, Goodbye!");
				break;
			}
			input = inputStr.toCharArray();
			res = check(chs, input);
			if (res[0] == chs.length) {
				int score = 100 * chs.length - count * 10;
				System.out.println("Congraduation! Your total score is "
						+ score);
			} else {
				count++;
				System.out.println("You guess right " + res[0]
						+ " letters and " + res[1] + " positions. (Total try: "
						+ count + " times, type 'exit' to quit)");
			}
		}
		scan.close();

	}

	// check()compares two array and returns the difference
	public static int[] check(char[] chs, char[] input) {
		int[] result = new int[2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (chs[i] == input[j]) {
					result[0] += 1;
					if (i == j) {
						result[1] += 1;
					}
				}
			}
		}
		return result;
	}

	// generate() to generate 5 random letters that for use to guess
	public static char[] generate(int arrayLength) {
		char[] chr = new char[arrayLength];
		char[] letters = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z' };
		boolean[] flags = new boolean[letters.length];
		for (int i = 0; i < chr.length; i++) {
			int index;
			do {
				index = (int) (Math.random() * (letters.length));
			} while (flags[index]);
			chr[i] = letters[index];
			flags[i] = true;
		}
		return chr;

	}
}
