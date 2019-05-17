import java.util.Scanner;

public class Starter {
	public void start() {
		System.out.println("Welcome to TTY Golf!");
		System.out.println();
		System.out.println("You can exit this game at any time by typing in 999.");
		System.out.println("Please select a course: ");
		System.out.println("1. Genesee Valley Park North Course \n2. The Old Course at St. Andrews");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		//You choose what gold course you want to play in
		while (true) {

			if (n == 1) {
				//plays the Genesee course
				Courses course = new Genesee();
				course.play();
			}

			else if (n == 2) {
				//plays the Old course
				Courses course = new Old();
				course.play();
			}

			else if (n == 0) {
				//terminated the program
				System.out.println("GAME TERMINATED");
				break;
			}

			else {
				System.out.println("Please enter valid option.");
			}
		
			//After the user has played a round we ask if they would like to play another round... 
			System.out.println("Would you like to play another round? If yes: ");
			System.out.println("Please select a course: ");
			System.out.println("1. Genesee Valley Park North Course \n2. The Old Course at St. Andrews");
			System.out.println("Or enter 0 to exit");
			n = scanner.nextInt();
		}

	}
}	
	