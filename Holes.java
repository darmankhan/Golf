//has info for each hole for The Old Course
public class Holes {
	double dist;
	int par;
	String s;
	
	//returns all the info for a hole if getHole is called 
	public String getHole(int n) {
	switch(n) {
	case 1:
		s = "You are at Burn. 376 yards, par 4";
		dist = 376;
		par = 4;
		break;
	case 2:
		s ="You are at Dyke. 453 yards, par 5";
		dist = 453;
		par = 4;
		break;
	case 3:
		s="You are at Cartgate(out). 397 yards, par 4";
		dist=397;
		par=4;
		break;
	case 4:
		s="You are at Ginger Beer. 480 yards, par 4";
		dist=480; 
		par=4;
		break;
	case 5:
		s="You are at Hole O'Cross(Out).568 yards, par 5";
		dist=568;
		par=5;
		break;
	case 6:
		s="You are at Heathery(Out).412 yards, par 4";
		dist=412;
		par=4;
		break;
	case 7:
		s="You are at High(Out).371 yards, par 4";
		dist=371;
		par=4;
		break;
	case 8:
		s="You are at Short.175 yards, par 3";
		dist=175;
		par=3;
		break;
	case 9:
		s="You are at End.352 yards, par 4";
		dist=352;
		par=4;
		break;
	case 10:
		s="You are at Bobby Jones.386 yards, par 4";
		dist=386;
		par=4;
		break;
	case 11:
		s="You are at High(In).174 yards, par 3";
		dist=174;
		par=3;
		break;
	case 12:
		s="You are at Heathery(In).348 yards, par 4";
		dist=348;
		par=4;
		break;
	case 13:
		s="You are at Hole O'Cross(In).465 yards, par 4";
		dist=465;
		par=4;
		break;
	case 14:
		s="You are at Long.618 yards, par 5";
		dist=618;
		par=5;
		break;
	case 15:
		s="You are at Cartgate(In).455 yards, par 4";
		dist=455;
		par=4;
		break;
	case 16:
		s="You are at Corner of the Dyke.423 yards, par 4";
		dist=423;
		par=4;
		break;
	case 17:
		s="You are at Road.495 yards, par 4";
		dist=395;
		par=4;
		break;
	case 18:
		s="You are at Tom Morris.357 yards, par 4";
		dist=357;
		par=4;
		break;
		}
		return s;
	}	
	
	//Returns only the par value
	public int getPar(int n) {
		switch(n) {
		case 1:
			s = "You are at Burn. 376 yards, par 4";
			dist = 376;
			par = 4;
			break;
		case 2:
			s ="You are at Dyke. 453 yards, par 5";
			dist = 453;
			par = 4;
			break;
		case 3:
			s="You are at Cartgate(out). 397 yards, par 4";
			dist=397;
			par=4;
			break;
		case 4:
			s="You are at Ginger Beer. 480 yards, par 4";
			dist=480; 
			par=4;
			break;
		case 5:
			s="You are at Hole O'Cross(Out).568 yards, par 5";
			dist=568;
			par=5;
			break;
		case 6:
			s="You are at Heathery(Out).412 yards, par 4";
			dist=412;
			par=4;
			break;
		case 7:
			s="You are at High(Out).371 yards, par 4";
			dist=371;
			par=4;
			break;
		case 8:
			s="You are at Short.175 yards, par 3";
			dist=175;
			par=3;
			break;
		case 9:
			s="You are at End.352 yards, par 4";
			dist=352;
			par=4;
			break;
		case 10:
			s="You are at Bobby Jones.386 yards, par 4";
			dist=386;
			par=4;
			break;
		case 11:
			s="You are at High(In).174 yards, par 3";
			dist=174;
			par=3;
			break;
		case 12:
			s="You are at Heathery(In).348 yards, par 4";
			dist=348;
			par=4;
			break;
		case 13:
			s="You are at Hole O'Cross(In).465 yards, par 4";
			dist=465;
			par=4;
			break;
		case 14:
			s="You are at Long.618 yards, par 5";
			dist=618;
			par=5;
			break;
		case 15:
			s="You are at Cartgate(In).455 yards, par 4";
			dist=455;
			par=4;
			break;
		case 16:
			s="You are at Corner of the Dyke.423 yards, par 4";
			dist=423;
			par=4;
			break;
		case 17:
			s="You are at Road.495 yards, par 4";
			dist=395;
			par=4;
			break;
		case 18:
			s="You are at Tom Morris.357 yards, par 4";
			dist=357;
			par=4;
			break;
			}
		return par;	
	}
	
	//return only the distance value
	public double getDist(int n) {
		switch(n) {
		case 1:
			s = "You are at Burn. 376 yards, par 4";
			dist = 376;
			par = 4;
			break;
		case 2:
			s ="You are at Dyke. 453 yards, par 5";
			dist = 453;
			par = 4;
			break;
		case 3:
			s="You are at Cartgate(out). 397 yards, par 4";
			dist=397;
			par=4;
			break;
		case 4:
			s="You are at Ginger Beer. 480 yards, par 4";
			dist=480; 
			par=4;
			break;
		case 5:
			s="You are at Hole O'Cross(Out).568 yards, par 5";
			dist=568;
			par=5;
			break;
		case 6:
			s="You are at Heathery(Out).412 yards, par 4";
			dist=412;
			par=4;
			break;
		case 7:
			s="You are at High(Out).371 yards, par 4";
			dist=371;
			par=4;
			break;
		case 8:
			s="You are at Short.175 yards, par 3";
			dist=175;
			par=3;
			break;
		case 9:
			s="You are at End.352 yards, par 4";
			dist=352;
			par=4;
			break;
		case 10:
			s="You are at Bobby Jones.386 yards, par 4";
			dist=386;
			par=4;
			break;
		case 11:
			s="You are at High(In).174 yards, par 3";
			dist=174;
			par=3;
			break;
		case 12:
			s="You are at Heathery(In).348 yards, par 4";
			dist=348;
			par=4;
			break;
		case 13:
			s="You are at Hole O'Cross(In).465 yards, par 4";
			dist=465;
			par=4;
			break;
		case 14:
			s="You are at Long.618 yards, par 5";
			dist=618;
			par=5;
			break;
		case 15:
			s="You are at Cartgate(In).455 yards, par 4";
			dist=455;
			par=4;
			break;
		case 16:
			s="You are at Corner of the Dyke.423 yards, par 4";
			dist=423;
			par=4;
			break;
		case 17:
			s="You are at Road.495 yards, par 4";
			dist=395;
			par=4;
			break;
		case 18:
			s="You are at Tom Morris.357 yards, par 4";
			dist=357;
			par=4;
			break;
			}
		return dist;
	}
}
