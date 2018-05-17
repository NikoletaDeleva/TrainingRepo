package pharmacy;

public class MedicamentFactory {
	private static final double ASPIRIN_PRICE = 2;
	private static final double	PARACETAMOL_PRICE = 3;
	private static final double VITAMINC_PRICE = 1;
	private static final double ESPUMIZAN_PRICE = 4;
	
	public static Medicament create(MedicamentType type) {
		Medicament medicament = null;
		
		switch (type) {
		case Paracetamol:
			medicament = new Medicament(MedicamentType.Paracetamol, PARACETAMOL_PRICE);
			break;
		case Espumizan:
			medicament = new Medicament(MedicamentType.Espumizan, ESPUMIZAN_PRICE);
			break;
		case VitaminC:
			medicament = new Medicament(MedicamentType.VitaminC, VITAMINC_PRICE);
			break;
		case Aspirin:
			medicament = new Medicament(MedicamentType.Aspirin, ASPIRIN_PRICE);
			break;
		default:
			break;
		}
		
		return medicament;
	}
}
