package OtLekciq16;

import java.util.Arrays;

public class WarGame {

	static void fillDeck(int[] a) {
		int countZeros = 0;
		int i = 0;
		do {
			int power = (int) (Math.random() * 13 + 2);
			int count = 0;
			countZeros = 0;
			for (int index = 0; index < a.length; index++) {
				if (a[index] == power) {
					count++;
				}
				if (a[index] == 0) {
					countZeros++;
				}
			}
			if (count < 4) {
				a[i++] = power;
			}
		} while (countZeros > 0);
	}

	static int ifEven(Cards[] a, Cards[] b, int index) {
		if (index >= a.length - 1) {
			return a.length - 1;
		} // ako poslednite karti sa ravni (otivat pri player1)
		int number = 0;
		if (index == a.length - 2) {
			number = 1;
		} else {
			if (index == a.length - 3) {
				number = 2;
			} else {
				number = 3;
			}
		}
		if (a[index + number].power > b[index + number].power) {
			return index + number;

		} else {
			if (a[index + number].power < b[index + number].power) {
				return index + number + 100;
			} else {
				return ifEven(a, b, index + number);
			}
		}
	}

	static int countCards(Cards[] a, int index, int count) {
		if (index >= a.length) {
			return count;
		}
		if (a[index] != null) {
			count++;
		} else {
			return count;
		}
		return countCards(a, index + 1, count);
	}

	public static void main(String[] args) {

		int[] deckOfCards = new int[52];
		fillDeck(deckOfCards);

		Cards[] player1 = new Cards[26];
		Cards[] player2 = new Cards[26];
		int card = 0;
		for (int index = 0; index < player1.length; index++) {
			player1[index] = new Cards(deckOfCards[card++]);
			player2[index] = new Cards(deckOfCards[card++]);
		}

		Cards[] cardsWonByPlayer1 = new Cards[52];
		Cards[] cardsWonByPlayer2 = new Cards[52];

		for (int index = 0; index < player1.length; index++) {
			if (player1[index].power > player2[index].power) {
				for (int i = 0; i < cardsWonByPlayer1.length - 1; i++) {
					if (cardsWonByPlayer1[i] == null) {
						cardsWonByPlayer1[i] = player1[index];
						cardsWonByPlayer1[i + 1] = player2[index];
						break;
					}
				}
			} else {
				if (player1[index].power < player2[index].power) {
					for (int i = 0; i < cardsWonByPlayer2.length - 1; i++) {
						if (cardsWonByPlayer2[i] == null) {
							cardsWonByPlayer2[i] = player1[index];
							cardsWonByPlayer2[i + 1] = player2[index];
							break;
						}
					}
				} else {
					int winner = ifEven(player1, player2, index);
					int count = 0;
					int howManyCards = winner - index + 1; // tolkova karti e izvadil vseki igrach na masata
					if (winner < 100) { // zna4i 4e player1 e pobedil
						for (int i = 0; i < cardsWonByPlayer1.length - 1; i++) {
							if (cardsWonByPlayer1[i] == null) {
								cardsWonByPlayer1[i] = player1[index];
								cardsWonByPlayer1[i + 1] = player2[index];
								index++;
								count++;
								if (count >= howManyCards) {
									break;
								}
							}
						}
						index--;
					} else { // zna4i 4e player2 e pobedil
						howManyCards -= 100;
						for (int i = 0; i < cardsWonByPlayer2.length - 1; i++) {
							if (cardsWonByPlayer2[i] == null) {
								cardsWonByPlayer2[i] = player1[index];
								cardsWonByPlayer2[i + 1] = player2[index];
								index++;
								count++;
								if (count >= howManyCards) {
									break;
								}
							}
						}
						index--;
					}
				}
			}
		}
		if (countCards(cardsWonByPlayer1, 0, 0) > countCards(cardsWonByPlayer2, 0, 0)) {
			System.out.println("The winner is Player1");
		} else {
			if (countCards(cardsWonByPlayer1, 0, 0) < countCards(cardsWonByPlayer2, 0, 0)) {
				System.out.println("The winner is Player2");
			} else {
				System.out.println("Both players won the same number of cards");
			}
		}
	}
}
