package day07;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		int[] chr = new chr[];
		chr = generate();
		System.out.println(chr);
	}

	public static int generate() {
		char[] chr = new char[5];
		char[] letters = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z' };
		boolean[] flags = new boolean[letters.length];
		for (int i = 0; i < chr.length; i++) {
			int index;
			do {
				index = Math.random() * (letters.length);
			} while (flags[index]);
			chr[i] = index;
			flags[i] = true;
		}
		return chr;

	}
}
