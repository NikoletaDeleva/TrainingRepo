package bank;

public class Kredit extends Product{
	private static final String PRODUCT = "Kredit";
	private TypeOfKredit type;
	private float vnoska;
	
	public Kredit(TypeOfKredit kreditType, int period,  float vnoska) {
		super(PRODUCT, period,kreditType.getLihva());
		this.type = kreditType;
		setVnoska(vnoska);
	}

	public void setVnoska(float vnoska) {
		if(vnoska >0) {
			this.vnoska = vnoska;
		}else {
			System.out.println("Vuvedi validna vnoska!");
		}
	}
	
	
}
