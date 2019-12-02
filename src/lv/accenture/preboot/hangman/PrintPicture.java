package lv.accenture.preboot.hangman;

public class PrintPicture {
    //skaititajs - tam ir jÄ�bÅ«t int mainÄ«gajam, kurÅ¡ uzskaita, kurÅ¡ pÄ“c kÄ�rtas nepareizais minÄ“jums tas ir
    //Å¡ajÄ� versijÄ� spÄ“lÄ“tÄ�js pie 8.nepareizÄ� minÄ“juma zaudÄ“ - varu pamainÄ«t bildi, lai zaudÄ“ Ä�trÄ�k vai vÄ“lÄ�k
    
    //private static int skaititajs = 0;

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
            System.out.println("\n");
            System.out.println("You lost!");
        }
    }
}
