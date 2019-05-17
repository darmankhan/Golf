//has info for all the holes for the Genesee Course
public class GeneseeHoles {
	double dist;
	int par;
	String s;

	//Returns everything about a hole
	public String getHole(int n) {
		switch(n) {
		case 1:
		s = "You are at the first tee. The first hole is 530 yards away.";
		dist =530;
		par=5;
		break;
		case 2:
		s="The 2nd hole is 305 yards away.";
		dist=305;
		par=4;
		break;
		case 3:
		s="The 3rd hole is 331 yards away.";
		dist=331;
		par=4;
		break;
		case 4:
		s="The 4th hole is 201 yards away.";
		dist=201;
		par=3;
		break;
		case 5:
		s="The 5th hole is 500 yards away.";
		dist=501;
		par=5;
		break;
		case 6:
		s="The 6th hole is 226 yards away.";
		dist=226;
		par=3;
		break;
		case 7:
		s="The 7th hole is 409 yards away.";
		dist=409;
		par=4;
		break;
		case 8:
		s="The 8th hole is 410 yards away.";
		dist=410;
		par=3;
		break;
		case 9:
		s="The 9th hole is 229 yards away.";
		dist=229;
		par=4;
		break;
		case 10:
		s="The 10th hole is 433 yards away.";
		dist=433;
		par=4;
		break;
		case 11:
		s="The 11th hole is 363 yards away.";
		dist=363;
		par=3;
		break;
		case 12:
		s="The 12th hole is 174 yards away.";
		dist=174;
		par=4;
		break;
		case 13:
		s="The 13th hole is 545 yards away.";
		dist=545;
		par=4;
		break;
		case 14:
		s="The 14th hole is 419 yards away.";
		dist=419;
		par=5;
		break;
		case 15:
		s="The 15th hole is 512 yards away.";
		dist=512;
		par=4;
		break;
		case 16:
		s="The 16th hole is 410 yards away.";
		dist=410;
		par=4;
		break;
		case 17:
		s="The 17th hole is 320 yards away.";
		dist=320;
		par=4;
		break;
		case 18:
		s="The 18th hole is 170 yards away.";
		dist=170;
		par=4;
		break;
		}
		return s;
	}
	
	//returns the total distance for a hole
	public double getDist(int n) {
		switch(n) {
		case 1:
		s = "You are at the first tee. The first hole is 530 yards away.";
		dist =530;
		par=5;
		break;
		case 2:
		s="The 2nd hole is 305 yards away.";
		dist=305;
		par=4;
		break;
		case 3:
		s="The 3rd hole is 331 yards away.";
		dist=331;
		par=4;
		break;
		case 4:
		s="The 4th hole is 201 yards away.";
		dist=201;
		par=3;
		break;
		case 5:
		s="The 5th hole is 500 yards away.";
		dist=501;
		par=5;
		break;
		case 6:
		s="The 6th hole is 226 yards away.";
		dist=226;
		par=3;
		break;
		case 7:
		s="The 7th hole is 409 yards away.";
		dist=409;
		par=4;
		break;
		case 8:
		s="The 8th hole is 410 yards away.";
		dist=410;
		par=3;
		break;
		case 9:
		s="The 9th hole is 229 yards away.";
		dist=229;
		par=4;
		break;
		case 10:
		s="The 10th hole is 433 yards away.";
		dist=433;
		par=4;
		break;
		case 11:
		s="The 11th hole is 363 yards away.";
		dist=363;
		par=3;
		break;
		case 12:
		s="The 12th hole is 174 yards away.";
		dist=174;
		par=4;
		break;
		case 13:
		s="The 13th hole is 545 yards away.";
		dist=545;
		par=4;
		break;
		case 14:
		s="The 14th hole is 419 yards away.";
		dist=419;
		par=5;
		break;
		case 15:
		s="The 15th hole is 512 yards away.";
		dist=512;
		par=4;
		break;
		case 16:
		s="The 16th hole is 410 yards away.";
		dist=410;
		par=4;
		break;
		case 17:
		s="The 17th hole is 320 yards away.";
		dist=320;
		par=4;
		break;
		case 18:
		s="The 18th hole is 170 yards away.";
		dist=170;
		par=4;
		break;
		}
		return dist;
	}
	
	//returns the par for a particular hole
	public int getPar(int n) {
		switch(n) {
		case 1:
		s = "You are at the first tee. The first hole is 530 yards away.";
		dist =530;
		par=5;
		break;
		case 2:
		s="The 2nd hole is 305 yards away.";
		dist=305;
		par=4;
		break;
		case 3:
		s="The 3rd hole is 331 yards away.";
		dist=331;
		par=4;
		break;
		case 4:
		s="The 4th hole is 201 yards away.";
		dist=201;
		par=3;
		break;
		case 5:
		s="The 5th hole is 500 yards away.";
		dist=501;
		par=5;
		break;
		case 6:
		s="The 6th hole is 226 yards away.";
		dist=226;
		par=3;
		break;
		case 7:
		s="The 7th hole is 409 yards away.";
		dist=409;
		par=4;
		break;
		case 8:
		s="The 8th hole is 410 yards away.";
		dist=410;
		par=3;
		break;
		case 9:
		s="The 9th hole is 229 yards away.";
		dist=229;
		par=4;
		break;
		case 10:
		s="The 10th hole is 433 yards away.";
		dist=433;
		par=4;
		break;
		case 11:
		s="The 11th hole is 363 yards away.";
		dist=363;
		par=3;
		break;
		case 12:
		s="The 12th hole is 174 yards away.";
		dist=174;
		par=4;
		break;
		case 13:
		s="The 13th hole is 545 yards away.";
		dist=545;
		par=4;
		break;
		case 14:
		s="The 14th hole is 419 yards away.";
		dist=419;
		par=5;
		break;
		case 15:
		s="The 15th hole is 512 yards away.";
		dist=512;
		par=4;
		break;
		case 16:
		s="The 16th hole is 410 yards away.";
		dist=410;
		par=4;
		break;
		case 17:
		s="The 17th hole is 320 yards away.";
		dist=320;
		par=4;
		break;
		case 18:
		s="The 18th hole is 170 yards away.";
		dist=170;
		par=4;
		break;
		}
		return par;
	}

}
