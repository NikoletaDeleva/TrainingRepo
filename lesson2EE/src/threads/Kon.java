package threads;

public class Kon implements Runnable {
	private String name;
	private static int horseNumber;
	private int currentHorse;
	
	Kon(String name){
		this.currentHorse = ++horseNumber;
		setName(name);
	}
	
	@Override
	public void run() {
		
		for(int index=1; index<50; index++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				return;
			}
			System.out.println(getName() + " izbqga " + index + " metra.");
		}
		
	}
	
	
	private void setName(String name2) {
		if(name != null) {
			this.name = name;
		}	
	}
	
	private String getName() {
		
		return this.name;
	}

}
