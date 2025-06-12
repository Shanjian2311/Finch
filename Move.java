package FinchPackage;
public class Move{
	public static void main(String[] args) {
		Finch f1 = new Finch();
		f1.setMotors(10, 10);
		
		if(f1.getDistance() < 5) {
			f1.setMove("B",10, 10); //Move backward increase the distance//
			f1.setBeak(100,0,0); //shows red led lights as alret sign//
			f1.setTurn("R", 90, 5); //turn right 90 degree//
		}

		
		
		if(f1.getDistance() <= 3) {
			f1.stop(); 
		}
		
		f1.stop();
		f1.disconnect();
		}
	}
