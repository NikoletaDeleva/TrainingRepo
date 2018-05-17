package velikden;

public class Dete implements Runnable {
	private Tendjera tendjera;
	private Masa masa;
	private Qice qice;
	private String name;

	public Dete(String name, Tendjera tendjera, Masa masa) {
		this.setName(name);
		this.masa = masa;
		this.tendjera = tendjera;
	}

	@Override
	public void run() {
		
		while (tendjera.isFull()) {
			try {
				this.qice = tendjera.vzemiQice();
			} catch (QicataSvurshihaException e) {
				e.printStackTrace();
			}
			
			try {
				masa.naTiQice(qice);
			} catch (BurkanException e) {
				e.printStackTrace();
			}

		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
