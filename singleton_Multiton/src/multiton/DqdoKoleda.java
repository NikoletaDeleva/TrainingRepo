package multiton;

import java.util.ArrayList;
import java.util.List;

public class DqdoKoleda {
	private final static byte MAX_BROI_DEDOVCI = 5;
	private static List<DqdoKoleda> dedovci = new ArrayList<DqdoKoleda>();
	
	private DqdoKoleda(){
		System.out.println("Suzdadoh oshte edin dqdo Koleda");
		
	}
	
	public static DqdoKoleda getInstance() {
		if(dedovci.size() < MAX_BROI_DEDOVCI) {
			DqdoKoleda dedo = new DqdoKoleda();
			dedovci.add(dedo);
			return dedo;
		}
		return dedovci.get((int)(Math.random()*dedovci.size()));
	}
}
