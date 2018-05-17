package selo;
//Resource
public class Kazan {
	private final static byte MAX_SIZE = 10;
	private Plod typeOfPrduct;
	private byte dostignatoKolichestvo;
	
	public Kazan () {
	}

	public Plod getTypeOfPrduct() {
		return typeOfPrduct;
	}

	public void setTypeOfPrduct(Plod typeOfPrduct) {
		this.typeOfPrduct = typeOfPrduct;
	}

	public void buhaiPlodove() {
		if(isEmpty()) {
			this.dostignatoKolichestvo++;			
		}
	}
	
	public boolean isFull() {
		if(dostignatoKolichestvo == MAX_SIZE) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if(dostignatoKolichestvo < MAX_SIZE) {
			return true;
		}
		return false;
	}
	
	public byte getDostignatoKolichestvo() {
		return this.dostignatoKolichestvo;
	}
	
}
