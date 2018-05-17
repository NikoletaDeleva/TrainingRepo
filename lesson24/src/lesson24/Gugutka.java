package lesson24;

public class Gugutka {
	private static final float DEF_DULJINA_NA_KLUNA = 0.01f;
	private static final float DEF_TEGLO = 0.1f;
	private String name;
	private float teglo;
	private float duljinaNaKluna;
	
	public Gugutka(String name, float teglo, float duljinaNaKluna) {
		this.setName(name);
		this.setTeglo(teglo);
		this.setDuljinaNaKluna(duljinaNaKluna);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTeglo() {
		return teglo;
	}

	public void setTeglo(float teglo) {
		this.teglo = teglo;
	}

	public float getDuljinaNaKluna() {
		return duljinaNaKluna;
	}

	public void setDuljinaNaKluna(float duljinaNaKluna) {
		this.duljinaNaKluna = duljinaNaKluna;
	} 
	
	@Override
	public boolean equals(Object arg0) {
		
		return true;
	}
	
	@Override
	public int hashCode() {
		
		return 0 ;
	}
	
}
