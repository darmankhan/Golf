import java.util.Scanner;

public class Genesee extends Courses{

	//a method in this particular course for looping through all the various holes
	@Override
	public int play() {
		System.out.println();
		System.out.println("You are playing at The Genesee.");
		
		Scanner sc = new Scanner (System.in);
		String exit = null;
		int gamescore = 0;
		
	for (int holex = 1 ; holex <= 18; holex++)
	{
		//makes a gameplay class and calls a method that contains game functionality
		GameplayGenesee round1 = new GameplayGenesee (holex);
		int holescore = round1.shot();
		gamescore = gamescore + holescore;
		System.out.print("Your current score in this round is ");
		System.out.format("%+d", gamescore);
		System.out.print(".");
		System.out.println();
		
		//allows user to exit the game or continue to the next hole
		System.out.println("\nType \"return\" to continue to the next hole or type \"exit\" to go back to game menu." );
		
		exit = sc.nextLine();
		
		if (exit.equals("return")) 
		{
			continue;
		} 
		
		else 
		{
			break;
		}
		
	}

	System.out.println();
	System.out.println("You ended the round with an overall score of " + gamescore + ".");
	System.out.println();
	return (int) gamescore;
		
		
	}

}
