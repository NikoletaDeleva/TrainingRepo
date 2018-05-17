package Sklad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Magazin extends Contact {
	protected List<Stoka> stokiVMagazina;
	
	
	public Magazin(String name) {
		super(name);
		this.stokiVMagazina = new ArrayList<Stoka>();
	}
	
	public List<Stoka> getStokiVMagazina() {
		return Collections.unmodifiableList(stokiVMagazina);
	}
}
