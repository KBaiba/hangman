package lv.accenture.preboot.hangman;

import java.util.Scanner;

public class Liene_hangman {
	/**
	 * @param args
	 */
	

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintPicture printer = new PrintPicture();
		
		String word = "triceratops";
		int i = 0;
		int countGuessed = 0;
		int countMistakes = 0;

		char[] symbols = new char[word.length()];
		for (i = 0; i < word.length(); i++) {
			symbols[i] = word.charAt(i);
		}

		char[] symbols2 = new char[word.length()];
		for (i = 0; i < word.length(); i++) {
			symbols2[i] = '*';
		}
		
		
		while ((countGuessed != word.length()) && (countMistakes < 8)) {
			for (i = 0; i < symbols2.length; i++) {
				System.out.print(symbols2[i] + " ");
			}
			System.out.println("");
			System.out.println("Please enter a letter!");

			Scanner sc = new Scanner(System.in);
			char userGuess1 = sc.next().charAt(0);
			char userGuess=Character.toLowerCase(userGuess1);
			boolean mistake = true;

			for (i = 0; i < symbols.length; i++) {
				if ((symbols[i] == userGuess) && (symbols2[i] == userGuess)) {
					mistake = false;
				} else if (symbols[i] == userGuess) {
					symbols2[i] = userGuess;
					countGuessed = countGuessed + 1;
					mistake = false;
				}
			}

			if (mistake) {
				countMistakes = countMistakes + 1;
				printer.printPicture(countMistakes);
				System.out.println("That's not correct! You have " + (8 - countMistakes) + " mistakes left!");
			}
			System.out.println("Guessed:" + countGuessed);
			System.out.println("Mistakes: " + countMistakes);
		}
		for (i = 0; i < symbols2.length; i++) {
			System.out.print(symbols2[i] + " ");
		}
		System.out.println("");
		if (countGuessed == word.length()) {
			System.out.println("Congratulations! You won! :)");
		}
	}

}
