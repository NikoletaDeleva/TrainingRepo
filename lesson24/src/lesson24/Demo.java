package lesson24;

import java.util.HashSet;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		

	Set<Gugutka> piqnaGugutka = new HashSet<Gugutka>();
	
	piqnaGugutka.add(new Gugutka("Ganka",  0.2f, 0.02f));
	piqnaGugutka.add(new Gugutka("Penka",  0.7f, 0.05f));
	piqnaGugutka.add(new Gugutka("Conka",  1.2f, 0.10f));
	piqnaGugutka.add(new Gugutka("Donka",  0.1f, 0.01f));
	
	Set<Gugutka> nadrusanaGugutka = new HashSet<Gugutka>();
	
	nadrusanaGugutka.add(new Gugutka("Moni", 0.35f, 0.03f));
	nadrusanaGugutka.add(new Gugutka("Peni", 0.56f, 0.08f));
	nadrusanaGugutka.add(new Gugutka("Sisi", 0.97f, 0.06f));
	nadrusanaGugutka.add(new Gugutka("Dani", 1.26f, 0.039f));
	
	}
}
