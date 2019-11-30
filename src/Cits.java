import java.util.Scanner;

public class Cits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Date: ");
		int userDate = sc.nextInt();

		System.out.println("Enter Month: ");
		int userMonth = sc.nextInt();

		System.out.println("Enter Year: ");
		long userYear = sc.nextLong();
		
		String result = "";
		switch(userMonth) {
			case 1: 
				result = "January";
				break;
			case 2: 
				result = "February";
				break;
			case 3: 
				result = "March";
				break;
			case 4: 
				result = "April";
				break;
			case 5: 
				result = "May";
				break;
			case 6: 
				result = "June";
				break;
			case 7: 
				result = "July";
				break;
			case 8: 
				result = "August";
				break;
			case 9: 
				result = "September";
				break;
			case 10: 
				result = "October";
				break;
			case 11: 
				result = "November";
				break;
			case 12: 
				result = "December";
				break;
			default:
				result = "Invalid date";
				
				if (userYear < 1) {
			        System.out.println("error");
				} else if ((userMonth < 1) || (userMonth > 12)) {
					System.out.println("error");
				} else if (userDate < 1) {
				System.out.println("error");
				} else if ((((userMonth == 4)||(userMonth == 6)||(userMonth == 9)||(userMonth == 11))) && ((userDate>30) || (userDate<1))) {
			        System.out.println("error");
				} else if ((userMonth == 1 || userMonth == 3 || userMonth == 5 || userMonth == 7 || userMonth == 8 || userMonth == 10 || userMonth == 12) && (userDate < 1 || userDate >31)) {
					System.out.println("error");
				} else if ((userMonth == 2) && (userDate > 28) && (userYear%4 != 0)) {
			        System.out.println("error");
				} else if ((userMonth == 2) && (userYear%4 == 0) && (userDate > 29)) {
			        System.out.println("error");
		} else { System.out.println(userDate + "." + result + " " + userYear + ".gads");
	}
		}
	}
}
