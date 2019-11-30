import java.util.Scanner;
public class AnnasHomeWork {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ievadiet datumu: ");
        int dateInt = sc.nextInt();
        System.out.println("Ievadiet mēnesi: ");
        int monthInt = sc.nextInt();
        System.out.println("Ievadiet gadu: ");
        int yearInt = sc.nextInt();
        
        String monthString = "";
        int maxDay = 0;
        switch (monthInt) {
        case 1:
            monthString = "Janvāris";
            maxDay = 31;
            break;
        case 2:
            monthString = "Februāris";
            maxDay = 29;
            if (yearInt%4 == 0) {
                maxDay = 29;
            } else {
                maxDay = 28;
            }
            break;
        case 3:
            monthString = "Marts";
            maxDay = 31;
            break;
        case 4:
            monthString = "Aprīlis";
            maxDay = 30;
            break;
        case 5:
            monthString = "Maijs";
            maxDay = 31;
            break;
        case 6:
            monthString = "Jūnijs";
            maxDay = 30;
            break;
        case 7:
            monthString = "Jūlijs";
            maxDay = 31;
            break;
        case 8:
            monthString = "Augusts";
            maxDay = 31;
            break;
        case 9:
            monthString = "Septembris";
            maxDay = 30;
            break;
        case 10:
            monthString = "Oktobris";
            maxDay = 31;
            break;
        case 11:
            monthString = "Novembris";
            maxDay = 30;
            break;
        case 12:
            monthString = "Decembris";
            maxDay = 31;
            break;
        default:
            monthString = "Invalid Month!";
            break;
        }
        if ((monthInt > 12 || monthInt < 1) || (dateInt <= 0 || dateInt > 31))
           System.out.println("ERROR!");
       else if (((monthInt == 4)||(monthInt == 6)||(monthInt == 9)||(monthInt == 11))&&(dateInt>30))
           System.out.println("ERROR!");
       else if ((monthInt == 2) && (dateInt > 29))
           System.out.println("ERROR!");
       else if ((monthInt == 2) && (yearInt % 4 != 0) && (dateInt > 27))
           System.out.println("ERROR!");     
       else
        System.out.println(dateInt + "." + " " + monthString + "," + " " + yearInt + "." + "gads");
    
        }
}