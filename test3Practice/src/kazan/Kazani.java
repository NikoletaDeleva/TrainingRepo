package kazan;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class Kazani {

	public enum Plodove{
		SLIVA, GROZDE, KAISIQ
	}
	
	private ConcurrentHashMap<Enum, Integer> kazani = new ConcurrentHashMap<>();
	
	
	public void beri(Enum p){
		synchronized (p) {
			if(kazani.size() < 5 && !kazani.containsKey(p)){
				kazani.put(p, 0);
				System.out.println("Nov kazan, imame: "+ kazani.size()+".");
			}
			while(!hasFreeKazan(p)){
				try {
					p.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			kazani.put(p, kazani.get(p)+1);
			System.out.println("Slojih " + p + " v kazanq. Availbale: " + kazani.get(p) + ".");
			p.notifyAll();
		}
	}
	
	public void vari(Enum p){
		synchronized (p) {
			while(!hasFullKazan(p)){
				try {
					p.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Izvarqvam rakiq ot " +p+ ".");
			removeFirstFullKazan(p);
			System.out.println("Kazani: "+ kazani.size() +".");
			p.notifyAll();
		}
	}
	
	private boolean hasFreeKazan(Enum plod){
		for (Enum p : kazani.keySet()) {
			if(p.equals(plod) && kazani.get(p) < 10){
				return true;
			}
		}
		return false;
	}
	
	private boolean hasFullKazan(Enum plod){
		for (Enum p : kazani.keySet()) {
			if(p.equals(plod) && kazani.get(p) >= 10){
				return true;
			}
		}
		return false;
	}
	
	private void removeFirstFullKazan(Enum p){
		for (Enum plod : kazani.keySet()) {
			if(plod.equals(p) && kazani.get(p) >= 10){
				kazani.remove(p);
				System.out.println("Poluchih " +(new Random().nextInt(5)+5)+" kila rikiq.");
			}
		}
	}
	
}
