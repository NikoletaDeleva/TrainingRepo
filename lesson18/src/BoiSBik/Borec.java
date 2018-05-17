package BoiSBik;

public class Borec {
	private static final int DEFAULT_POWER = 3;
	private float power;
	private int health = 100;
	private EnergijnaNapitka energijnaNapitka;

	public EnergijnaNapitka getEnergijnaNapitka() {
		return energijnaNapitka;
	}

	public void setEnergijnaNapitka(EnergijnaNapitka energijnaNapitka) {
		if (energijnaNapitka != null) {
			this.energijnaNapitka = energijnaNapitka;
		}else {
			
		}
		
	}

	private String name = "";

	Borec(String name, float power) {
		if (name != null && name.trim().length() != 0) {
			this.name = name;
		} else {
			this.name = "";
		}

		if (power > 0) {
			this.power = power;
		} else {
			this.power = DEFAULT_POWER;
		}
	}

}
