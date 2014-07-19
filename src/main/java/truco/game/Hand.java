package truco.game;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import truco.model.Card;
import truco.model.Player;

import com.google.common.collect.Lists;

public class Hand {

	private List<Card> cards;
	private Player player;
	
	public Hand(Player player) {
		cards = Lists.newArrayList();
		this.player = player;
	}
	
	public void addCard(Card topCard) {
		this.cards.add(topCard);
	}
	
	public Player getPlayer() {
		return player;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public Card getCardAt(int i) {
		return this.cards.remove(i);
	}

}
