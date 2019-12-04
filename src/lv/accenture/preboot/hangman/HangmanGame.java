package lv.accenture.preboot.hangman;

import java.util.HashSet;
import java.util.Scanner;

public class HangmanGame {
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintPicture printer = new PrintPicture();
		WordChooser reader = new WordChooser();
		String word = reader.getWord();

		int i = 0;
		int countGuessed = 0;
		int countMistakes = 0;
		HashSet<Character> wrongGuess = new HashSet<Character>();

		char[] symbols = new char[word.length()];
		for (i = 0; i < word.length(); i++) {
			symbols[i] = word.charAt(i);
		}

		char[] symbols2 = new char[word.length()];
		for (i = 0; i < word.length(); i++) {
			symbols2[i] = '*';
		}
		System.out.println("Let the game begin! Here is a word to guess: ");
		
		while ((countGuessed != word.length()) && (countMistakes < 8)) {
			System.out.println("__________________________________________________________________________"+"\n");
			for (i = 0; i < symbols2.length; i++) {
				System.out.print(symbols2[i] + " ");
			}
			Scanner sc = new Scanner(System.in);

			System.out.println("");

			boolean validInput = false;
			String userGuess2 = " ";
			
			while (!validInput) {
				System.out.println("\n"+"Please enter a letter!");
				if (!wrongGuess.isEmpty()) {System.out.println("You've already tried: "+wrongGuess);
				
				}
				userGuess2 = sc.next();
				if ((userGuess2.matches("[A-Za-z]{1}")) && (userGuess2.length() == 1)) {
					validInput = true;
				} else {
					System.out.println("Wrong input!");
				}

			}

			char userGuess1 = userGuess2.charAt(0);
			char userGuess = Character.toLowerCase(userGuess1);
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

			if (mistake && !wrongGuess.contains(userGuess)) {
				countMistakes = countMistakes + 1;
				printer.printPicture(countMistakes);
				wrongGuess.add(userGuess);

				if (countMistakes < 8) {
					System.out.println("That's incorrect! You have " + (8 - countMistakes) + " mistakes left!");
				}
			} else if (mistake) {
				System.out.println("You already tried that letter!");
			}
			// System.out.println("Guessed:" + countGuessed);
			// System.out.println("Mistakes: " + countMistakes);
		}

		System.out.println("");
		if (countGuessed == word.length()) {
			System.out.println("Congratulations! You won! :)");
		} else {
			System.out.print("Sorry, you lost! :( The word was: ");
			for (i = 0; i < symbols.length; i++) {
				System.out.print(symbols[i] + " ");
			}
		}

	}

}
