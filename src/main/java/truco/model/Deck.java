package truco.model;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import truco.exception.InvalidMoveException;

import com.google.common.collect.Lists;

public class Deck implements Iterable<Card> {

	private List<Card> cards;
	
	//Este mazo es de 40 cartas, faltan 8 y 9
	public static Deck newSpanishDeck() {
		return new Deck();
	}
	
	private Deck() {
		cards = buildDeck();
	}

	public Deck shuffle() {
		Collections.shuffle(cards);
		return this;
	}
	
	public Card getTopCard() throws InvalidMoveException {
		if (cards.isEmpty()) {
			throw new InvalidMoveException("El mazo esta vacio");
		}
		return cards.remove(0);
	}
	
	private List<Card> buildDeck() {
		List<Card> cards = Lists.newArrayList();
		for (Suit suit : Suit.values()) {			
			for (int i = 1; i <= 7; i++) {
				cards.add(new Card(i, suit));
			}
			for (int i = 10; i <= 12; i++) {
				cards.add(new Card(i, suit));
			}
		}
		return cards;
	}

	public Iterator<Card> iterator() {
		return cards.iterator();
	}
}
