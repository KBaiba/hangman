package lv.accenture.preboot.hangman;

import java.util.Scanner;

public class Liene_hangman {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "dinozaurs";


		char[] symbols = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			symbols[i] = word.charAt(i);
		}
		
		char[] symbols2 = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			symbols[i] = word.charAt(i);
		}
		
		for (int i=0;i<symbols.length;i++) {
			System.out.print(symbols[i]+" ");
		}
		
		Scanner sc = new Scanner(System.in);
		char userGuess = sc.next().charAt(0);
		
		for (int i=0;i<symbols.length;i++) {
if (symbols[i]==userGuess){
	
}
		}

	}

}

