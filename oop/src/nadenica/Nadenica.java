package nadenica;

public abstract class Nadenica {
	abstract void zacvurchi();
	
	static class Makedonska extends Nadenica{
		@Override
		public void zacvurchi() {
			System.out.println("Cvurcha kato Makedonska nadenica!");
		}
	}
	
	static class Rodopska extends Nadenica{
		@Override
		public void zacvurchi() {
			System.out.println("Cvurcha kato Rodopska nadenica!");
		}
	}
	static Nadenica daiMi(String type) {
		if(type.equalsIgnoreCase("Makedonska")){
			
		}
	}
}
