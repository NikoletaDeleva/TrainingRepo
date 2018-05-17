package Sklad;

import java.util.List;

public class NeopitenRabotnik extends Rabotnik {

	public NeopitenRabotnik(String name, Sklad sklad) {
		super(name, sklad);
	}

	@Override
	public void podrediStoka(List<Stoka> stokiDaPodredq) {
		for(Stoka stoka : stokiDaPodredq) {
			if(Math.random() < 0.5) {
				this.sklad.addStoka(stoka);
				this.podredenaStoka++;
			}	
		}
	}
}
