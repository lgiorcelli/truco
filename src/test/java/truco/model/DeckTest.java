package truco.model;

import org.junit.Test;

public class DeckTest {

	@Test
	public void testShuffle() {
		Deck deck = Deck.newSpanishDeck();
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
