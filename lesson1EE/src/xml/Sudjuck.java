package xml;

public class Sudjuck {
	private String proizvoditel;
	private String sustavki;
	private String debelina;
	public Sudjuck(String proizvoditel, String sustavki, String debelina2) {
		this.setProizvoditel(proizvoditel);
		this.setSustavki(sustavki);
		this.setDebelina(debelina2);
	}
	public String getProizvoditel() {
		return proizvoditel;
	}
	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel = proizvoditel;
	}
	public String getSustavki() {
		return sustavki;
	}
	public void setSustavki(String sustavki) {
		this.sustavki = sustavki;
	}
	public String getDebelina() {
		return debelina;
	}
	public void setDebelina(String debelina2) {
		this.debelina = debelina2;
	}
}
