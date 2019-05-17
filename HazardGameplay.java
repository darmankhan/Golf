import java.util.Formatter;
import java.util.Scanner;
import java.util.Random;


public class HazardGameplay {

	//your first shot is 1
	int shotno;
	int holeno;
	//creates a holes class which has info for each hole for Old
	Holes hole = new Holes();

	public HazardGameplay(int holeno) {
		this.holeno = holeno;
	}

	//method that keeps track of score and calculates distance after each shot and return distance left
	//it also transitions you to a putter if the distance is less than 20 yards.
	public int shot() {
		int holescore = 0;
		double currentdis = hole.getDist(holeno);

		System.out.println(hole.getHole(holeno));
		//creates a clubs class that has info for clubs
		Clubs club = new Clubs();
		Scanner scanner = new Scanner(System.in);
		Random ran = new Random();

		while (true) {
			
			//lake hazard
			if (Math.abs(currentdis) > 100+ran.nextInt(130) && Math.abs(currentdis) < 130+ran.nextInt(150) )
			{
				System.out.println("You put the ball in the lake. Therefore you are getting a +10 for this hole." );
				holescore = hole.getPar(holeno) + 10;
				return holescore;
			}
			
			//bunker hazard
			else if ( Math.abs(currentdis) > 30+ran.nextInt(40) && Math.abs(currentdis) < 60+ran.nextInt(70) ) 
			{
				shotno++;
				System.out.println("You put the ball in the bunker. We added +1 to your score.");
				System.out.print(club.club_string(10));
				System.out.print("." + " Enter power [1-10]: ");
				int p = scanner.nextInt();
				if (p == 999) {
					holescore = hole.getPar(holeno) + 10;
					return holescore;
				}
				
				//sets the distance calculated by a shot to shotdist
				double shotdist = (club.nextDistance(club.club_m(10), club.club_s(10), p))*0.8 ;
				System.out.print("\n" + "You hit " + shotdist + " yards.");
				
				//calculates current distance by subtracting shotdist from currentdist
				currentdis = Math.abs(currentdis - shotdist);
				System.out.println("The current distance to hole is " + currentdis + " yards.");

				shotno++;
			}

			//distance covered by each shot is calculated by calling the club method and subtracting it from distance
			else if (Math.abs(currentdis) > 20) 
			{
				

				System.out.print("Choose your club [1-10]: ");
				int c = scanner.nextInt();
				
				//You can quit the round by pressing 999
				//and you get a +5 score penalty for quitting
				//EXTRA CREDIT 
				if (c == 999) {
					holescore = hole.getPar(holeno) + 5;
					return holescore;
				}
				
				System.out.print(club.club_string(c));
				System.out.print("." + " Enter power [1-10]: ");
				int p = scanner.nextInt();
				
				//You can quit the round by pressing 999
				//and you get a +5 score penalty for quitting
				//EXTRA CREDIT 
				if (p == 999) {
					holescore = hole.getPar(holeno) + 10;
					return holescore;
				}
				
				//sets the distance calculated by a shot to shotdist
				int shotdist = club.nextDistance(club.club_m(c), club.club_s(c), p);

				System.out.print("\n" + "You hit " + shotdist + " yards.");
				
				
				
				//calculates current distance by subtracting shotdist from currentdist
				currentdis = Math.abs(currentdis - shotdist);
				System.out.println("The current distance to hole is " + currentdis + " yards.");

				shotno++;
				

			}
			
		
			
			
			
			//putter method is called to calculate distance here
			else if (Math.abs(currentdis) >= 0.3333) 
			{
				Formatter formatterx = new Formatter();
				System.out.print("You are in the green.\nEnter putter power [1-10]: ");
				int d = scanner.nextInt();
				
				//EXTRA CREDIT exit option
				if (d == 999) {
					holescore = hole.getPar(holeno) + 10;
					return holescore;
				}
				
				double shotdist = club.putt(d); 
				Formatter formatter = new Formatter();
				currentdis = Math.abs(currentdis - shotdist);
				System.out.println("You putted " + formatter.format("%.1f",(shotdist*3)) + " feet.");
				
				System.out.println("Current distance to hole is " + formatterx.format("%.1f",(currentdis*3)) + " feet.");
				
				shotno++;
				
				
			}
			
			//this part returns your score and tells you what you got a bogey or a birdie or whatever
			else {
				holescore = shotno - hole.getPar(holeno);
				System.out.println("It's in the hole!");
				
				if(holescore == 0)
				{
					System.out.println("You made par on this hole.");
									
				} 
				
				else if(holescore == 1)
				{
					System.out.println("You got a bogey.");
					
				} 
				
				else if(holescore == -1)
				{
					System.out.println("You got a birdie.");
					
				} 
				
				else if(holescore == -2)
				{
					System.out.println("You got a Eagle.");
					
				} 
				
				else if(holescore == -3)
				{
					System.out.println("You got a Albatross.");
				
				} 
				
				else if(holescore == +2)
				{
					System.out.println("You got a double bogey.");
					
				} 
				
				else if(holescore == +3)
				{
					System.out.println("You got a triple bogey.");
					
				} 
				
				
				else {
					System.out.print("Your score for this hole is ");
					System.out.format("%+d", holescore);
					System.out.println(".");
				}
				
				return holescore;
			}
			
			

		}
	}
}
