package lv.accenture.preboot.hangman;

public class PrintArray {
	public void printSelf() {
		for (int i = 0; i <= currentPosition; i++) {
			System.out.print(contents[i] + " ");
		}
}
