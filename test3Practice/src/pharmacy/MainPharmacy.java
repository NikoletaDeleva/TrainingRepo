package pharmacy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainPharmacy {
	private static MainPharmacy mainPharmacy;
	private static final int DELIVERY_MEDICAMENT_COUNT = 10;
	private static final String name = "Main Pharmacy";

	public static MainPharmacy getInstance() {
		if (mainPharmacy == null) {
			mainPharmacy = new MainPharmacy();
		}

		return mainPharmacy;
	}

	public Map<MedicamentType, List<Medicament>> vzemiLekarstva() {
		Map<MedicamentType, List<Medicament>> lekarstva = new HashMap<>();

		for (MedicamentType medicamentType : MedicamentType.values()) {
			if (!lekarstva.containsKey(medicamentType)) {
				lekarstva.put(medicamentType, new ArrayList<>());
			}

			List<Medicament> currentMedicaments = lekarstva.get(medicamentType);
			for (int index = 0; index < DELIVERY_MEDICAMENT_COUNT; index++) {
				currentMedicaments.add(MedicamentFactory.create(medicamentType));
			}
		}

		return lekarstva;
	}

	public String getName() {
		return name;
	}
}
