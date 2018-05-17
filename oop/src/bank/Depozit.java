package bank;

public class Depozit extends Product{
	private static final String PRODUCT = "Depozit";
	private TypeOfDepozit type;
	private float izplatenaSuma;
	
	public Depozit(TypeOfDepozit depozitType) {
		super(PRODUCT, depozitType.getPeriod(),depozitType.getLihva());
		this.type = depozitType;
		this.izplatenaSuma = super.getNalichnost() * depozitType.getLihva();
	}
	
}
