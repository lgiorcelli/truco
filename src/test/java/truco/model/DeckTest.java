package truco.model;

import org.junit.Test;

import truco.model.Card;
import truco.model.Deck;

public class DeckTest {

	@Test
	public void testShuffle() {
		Deck deck = new Deck();
		printDeck(deck);
		deck.shuffle();
		System.out.println("Shuffle!!");
		printDeck(deck);
	}

	private void printDeck(Deck deck) {
		for (Card card : deck) {
			System.out.println(card);
		}
	}

}
