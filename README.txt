This project was done with the collaborative effort of 3 CSC171 students:
Names: Bahawar Dhillon( Net ID: bdhillon)
		Darman Khan  ( Net ID:dkhan2 )
		Emmanuel Debessa(Net ID: edebessa )
		
The program builds a TTY golf game in which the user has the option to play a course from two choices. The user has to play 18 holes in
each course to complete one round and at the end of a round the user can choose to play another round or quit the game. 
A 'Clubs' class stores the information about the various clubs and the methods club_s, and club_m are used to access the values of the 
standard deviation and mean for a club respectively. Using the mean and stddev for a club, and the power specified by the user, the nextDistance
method returns the distance (in yards) from the appropriate Gaussian distribution. A putt method also computes the distance (in feet) using 
Gaussian distribution but converts and returns it in yards to maintain consistency.

The 'Main' class contains the main method that calls a 'start' method from another class called 'starter' which starts the game and asks the 
user which course they would like to play. Based on the user's choice it takes them to the 'Genesee' or 'Old' class respectively while calling the 
'play' method from those classes. The play method contains a for loop which runs for each of the 18 holes in the course. For each hole,
a 'shot' method from the 'HazardGameplay'/'GameplayGenesee' class is called from within the loop. This shot method calculates the distance 
covered by the ball for each shot and subtracts it from the distance to the hole and stores it in a variable called 'currentdis' while the 
current distance is greater than 20 yards. When the currentdis is less than 20 yards the program switches to the putter method which it 
calls from the Clubs class. This method continues until the ball is within 1 feet of the hole which is considered as putting the ball in 
the hole. After each shot, the user has to type 'return' to continue to the next hole. 

The shot method also calculates the score for the hole by incrementing the shots the user plays and subtracting it from the par for that 
hole at the end. It then returns this 'holescore' to the for loop in the play method described earlier and adds it to a variable called 
'gamescore' which stores the total score of the user for a round. At the end of a round,the user has the option to quit or to start 
playing another course. This is done from within the 'starter' class.

Extra credit 1: The user is provided with the option to quit the round at any point they wish by entering 999. However, they are given
a penalty of +10 to their score for quitting.
Extra credit 2: The game is made to look more realistic by using Golf terms such as 'bogey', 'birdie', 'eagle', 'Albatross', 'double bogey',
and 'triple bogey'.
Extra credit 3: In the 'Old Course' hazards are created on the holes within specific distances from the hole which are generated using a random
range. If the ball lands in these ranges it is in the hazard. In the lake hazard the ball is lost and +10 is added to the user's hole score. 
The user then moves on to the next hole. In the bunker hazard +1 is added to the hole score and the user is forced to use a wedge (club 10) 
which is also less powerful which makes the ball harder to get out of the bunker.
Extra credit 4: We incorporated a 'cheat method' in the game where if the user enters power more than 10 that also works and makes the ball cover
a much larger distance. This can be used to cover more distance in less strokes and lower the overall hole score.