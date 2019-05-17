import java.util.Scanner;

public class Old extends Courses{


	@Override
	public int play() {
		System.out.println();
		System.out.println("You are playing The Old Course at St. Andrews.");
		Scanner sc = new Scanner (System.in);
		String exit = null;
		int gamescore = 0;

		//TESTING	
		for (int holex = 1 ; holex <= 18; holex++)
		{

			HazardGameplay hole1 = new HazardGameplay (holex);
			int holescore = hole1.shot();
			gamescore = gamescore + holescore;

			//		Gameplay round1 = new Gameplay (holex);
			//		int holescore = round1.shot();
			//		gamescore = gamescore + holescore;


			System.out.print("Your current score in this round is ");
			System.out.format("%+d", gamescore);
			System.out.print(".");
			System.out.println();
			System.out.println("\nType \"return\" to continue to the next hole or type \"exit\" to go back to game menu." );
			exit = sc.nextLine();

			if (exit.equals("return"))
			{
				continue;
			} 

			else if (exit.equals("exit"))

			{
				break;
			}

			else 
			{
				System.out.println("Enter valid input");
			}


		}

		System.out.println();
		System.out.println("You ended the round with an overall score of " + gamescore + ".");
		System.out.println();
		return (int) gamescore;

	}
}
