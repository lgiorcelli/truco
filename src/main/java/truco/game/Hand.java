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
	
	public Hand(Player player, List<Card> cards) {
		this.cards = Lists.newArrayList(cards);
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

//TODO No me convence del todo esto, tengo q conocer todo el tiempo el tamaño de la mano	
	public Card takeCardAt(int i) {
		return this.cards.remove(i);
	}

}
