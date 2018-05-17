package BoiSBik;

public class Bik {
	private static final int MAX_HIT_COEFF = 20;
	private static final int DEFAULT_POWER = 10;
	private final int power;
	private float haelth = 1000;
	
	Bik(int power){
		if(power>0) {
			this.power = power;
		}else {
			this.power = DEFAULT_POWER;
		}
	}
	
	public void ritai(Borec borec) {
		
		
		int powerOfRitnik = (int) (Math.random()*MAX_HIT_COEFF +1)*power;
		
		System.out.println("Bikut pita sus: " + powerOfRitnik);
		
	}
	
	
}
