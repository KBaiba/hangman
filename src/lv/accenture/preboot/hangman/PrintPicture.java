package lv.accenture.preboot.hangman;

public class PrintPicture {
    public void printPicture(int countMistakes) {
        if (countMistakes == 1) {
            System.out.println(" __________");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_");
        } else if (countMistakes == 2) {
            System.out.println(" __________");
            System.out.println("|");
            System.out.println("|         o");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_");
        } else if (countMistakes == 3) {
            System.out.println(" __________");
            System.out.println("|");
            System.out.println("|         o");
            System.out.println("|         |");
            System.out.println("|         |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_");
        } else if (countMistakes == 4) {
            System.out.println(" __________");
            System.out.println("|");
            System.out.println("|         o");
            System.out.println("|        /|");
            System.out.println("|         |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_");
        } else if (countMistakes == 5) {
            System.out.println(" __________");
            System.out.println("|");
            System.out.println("|         o");
            System.out.println("|        /|\\ ");
            System.out.println("|         |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_");
        } else if (countMistakes == 6) {
            System.out.println(" __________");
            System.out.println("|");
            System.out.println("|         o");
            System.out.println("|        /|\\ ");
            System.out.println("|         |");
            System.out.println("|        /");
            System.out.println("|");
            System.out.println("|_");
        } else if (countMistakes == 7) {
            System.out.println(" __________");
            System.out.println("|");
            System.out.println("|         o");
            System.out.println("|        /|\\ ");
            System.out.println("|         |");
            System.out.println("|        / \\");
            System.out.println("|");
            System.out.println("|_");
        } else if (countMistakes == 8) {
            System.out.println(" __________");
            System.out.println("|         |");
            System.out.println("|         o");
            System.out.println("|        /|\\ ");
            System.out.println("|         |");
            System.out.println("|        / \\");
            System.out.println("|");
            System.out.println("|_");
        }
    }
}
