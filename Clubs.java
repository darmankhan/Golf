import java.util.Random;
import java.util.Scanner;

public class Clubs {
	//mean and standard deviation and the name of the club will be stored in these variables
	int mean;
	int stdev;
	String s;
	
	//Returns the name of the club
	public String club_string(int n) {
		switch(n) {
		case 1:
			s="You are using a Driver";
			break;
		case 2:
			s="You are using a 3-Wood";
			break;
		case 3:
			s="You are using a 3-iron";	
			break;
		case 4:
			s="You are using a 4-iron";	
			break;
		case 5:
			s="You are using a 5-iron";
			break;
		case 6:
			s="You are using a 6-iron";
			break;
		case 7:
			s="You are using a 7-iron";
			break;
		case 8:
			s="You are using a 8-iron";
			break;
		case 9:
			s="You are using a 9-iron";
			break;
		case 10:
		    s="You are using a Wedge";
		    break;
		}
		return s;
		
	}
	
	//returns the standard deviation of the club
	public int club_s(int n) {
		switch(n) {
		case 1:
			stdev=30;
			break;
		case 2:
			stdev=20;
			break;
		case 3:
			stdev=20;
			break;
		case 4:
			stdev=17;
			break;
		case 5:
			stdev=15;
			break;
		case 6:
			stdev=15;
			break;
		case 7:
			stdev=30;
			break;
		case 8:
			stdev=30;
			break;
		case 9:
			stdev=30;
			break;
		case 10:
		    stdev=30;
		    break;
		}
		return stdev;
	}
	
	//returns the mean of the club
	public int club_m(int n) {
		switch(n) {
		case 1:
			mean=230;
			break;
		case 2:
			mean=215;
			break;
		case 3:
			mean=180;
			break;
		case 4:
			mean=170;
			break;
		case 5:
			mean=155;
			break;
		case 6:
			mean=145;
			break;
		case 7:
			mean=230;
			break;
		case 8:
			mean=230;
			break;
		case 9:
			mean=230;
			break;
		case 10:
		    mean=230;
		    break;
		}
		return mean;
	}
	
	//method to calculate the distance travelled by a particular shot with a particular power and club
	public static int nextDistance(int mean, int stdev, int power) {
		Random random = new Random();
		double mean_adj = mean * power / 10.0;
		double stdev_adj = stdev * power / 10.0;
		double dist = Math.abs(random.nextGaussian() * stdev_adj + mean_adj);
		return (int)dist;
	}
	

	//method for the putter - calculates distance for a given power
	public double putt(int d) {
			Random random = new Random();
			Scanner scanner = new Scanner(System.in);
			double []PuttMean = {1,2,4,8,12,16,20,25,30,40};
			double []PuttSD = {1,1,2,2,3,3,4,4,5,5};
			
			double mean = PuttMean[d-1];
			double std = PuttSD[d-1];
			//converted to yards
			double dist = (Math.abs(random.nextGaussian() * std + mean))/3;
			return dist;

		}
		
	

}
