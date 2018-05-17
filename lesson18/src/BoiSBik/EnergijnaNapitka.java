package BoiSBik;

public class EnergijnaNapitka {
	private static final double BOOST_COEFF = 1.5;
	private static final String POWER_BOOSTER = "Monster";
	private static final int MIN_GIVE_HEALTH = 50;
	private final String model;
	private float giveHealth;

	EnergijnaNapitka(String marka, int giveHealth) {
		if (marka != null && marka.trim().length() != 0) {
			this.model = marka;
		} else {
			this.model = "";
		}

		if (giveHealth > 0) {
			this.giveHealth = giveHealth;
		} else {
			this.giveHealth = MIN_GIVE_HEALTH;
		}

		if (marka.equalsIgnoreCase(EnergijnaNapitka.POWER_BOOSTER)) {
			this.giveHealth = (float) (giveHealth * BOOST_COEFF);
		}
	}
	
	

}
