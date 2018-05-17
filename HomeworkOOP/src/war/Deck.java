package war;

public class Deck {

	char card;
	int power;

	Deck (int power){
			this.power=power;
			if ((this.power >= 2) && (this.power <= 9)) {
				this.card = (char) (this.power + '0');
			}
			if (this.power== 10) {
				this.card = 'T';
			}
			if (this.power == 11) {
				this.card = 'J';
			}
			if (this.power ==12) {
				this.card = 'Q';
			}
			if (this.power == 13) {
				this.card = 'K';
			}
			if (this.power == 14) {
				this.card = 'A';
			}
		}

}
