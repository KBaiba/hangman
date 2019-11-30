import java.util.Scanner;

public class DateValidator_optimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter date: ");
		int date = sc.nextInt();

		System.out.println("Enter month: ");
		int month = sc.nextInt();

		System.out.println("Enter year: ");
		int year = sc.nextInt();

		if (date > 0 && month > 0) {
			int maxDays = 31;
			String monthName = "";
			boolean invalidInput = false;

			switch (month) {
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				/*if(year%4 == 0) {
					maxDays = 29;
				} else {
					maxDays = 28;} */
				maxDays = (year%4 == 0) ? 29 :28;      //ternārais pieraksts if'a funkcijai
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				maxDays = 30;
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				maxDays = 30;
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				maxDays = 30;
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				maxDays = 30;
				break;
			case 12:
				monthName = "December";
				break;
			default:
				invalidInput = true;
			}
			if (invalidInput == false && date <= maxDays) {
				System.out.println(date + ". " + monthName + ", " + year);
			} else {
				System.out.println("Invalid request");
			}
		} else {
			System.out.println("Invalid request");
		}

	}

}
