package FinchPackage;
public class Move{
	public static void main(String[] args) {
		Finch f1 = new Finch();
		
		f1.setMotors(10, 10);
		
		while(f1.getDistance() < 5) {
			f1.setMove("R", 5, 5);
		}
		
		
		f1.setMove("L", 10, 10);
		f1.pause(3);
		f1.setMove("R", 10, 10);
		
		
		if(f1.getDistance() < 3) {
			f1.stop();
		}
		
		f1.stop();
		
		}
	}
