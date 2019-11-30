import java.util.Scanner;

public class task001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter date: ");
		int userDate = sc.nextInt();

		System.out.println("Enter Month: ");
		int userMonth = sc.nextInt();

		System.out.println("Enter Year: ");
		long userYear = sc.nextLong();
	
	/*if (userYear < 1 &&  userYear > 9999) {
		if (userMonth >=1 && userMonth <= 12){
			if (userYear%4 != 0) {
				if (userMonth == 2 && userDate > 1 && userDate < 29) {
					if (userMonth == 1 || userMonth
				}
		}
	}
	} else { System.out.println("error") {if (userMonth)
	}
		
	}
}*/
	
		if ((userYear > 9999) || (userYear < 1)) {
	        System.out.println("error");
		} else if ((userMonth < 1) || (userMonth > 12)) {
			System.out.println("error");
		} else if (userDate < 1) {
		System.out.println("error");
		} else if (((userMonth == 4)||(userMonth == 6)||(userMonth == 9)||(userMonth == 11))&&(userDate>30)) {
	        System.out.println("error");
		} else if ((userMonth == 2) && (userDate > 28)) {
	        System.out.println("error");
		} else if ((userMonth == 2) && (userYear % 4 == 0) && (userDay > 29)) {
	        System.out.println("error");
} else System.out.println(userDay+"."+result+" "+year+".gads");
}
}




