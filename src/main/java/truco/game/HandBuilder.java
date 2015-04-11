package truco.game;

import java.util.List;

import truco.model.Card;
import truco.model.Player;

import com.google.common.collect.Lists;

public class HandBuilder {
	private List<Card> cards;
	private Player owner;
	
	public HandBuilder(Player player) {
		cards = Lists.newArrayList();
		this.owner = player;
	}

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public Hand build() {
		return new Hand(owner, cards);
	}
}
