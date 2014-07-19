package truco.model;

import java.util.Map;

import com.google.common.collect.Maps;

public class ValueScale {

	private Map<Card, Integer> scale;
	public ValueScale() {
		scale = buildScale();
	}

	public Boolean isGreater(Card card, Card card2) {
		int card1order = scale.get(card).intValue();
		int card2Order = scale.get(card2).intValue();
		return card1order < card2Order; 
	}
	

	public Boolean areEquals(Card card, Card card2) {
		int card1order = scale.get(card).intValue();
		int card2Order = scale.get(card2).intValue();
		return card1order == card2Order;
	}


	private Map<Card, Integer> buildScale() {
		Map<Card, Integer> scale = Maps.newHashMap();
		int order = 1;
		scale.put(new Card(1, Suit.ESPADA), order++);
		scale.put(new Card(1, Suit.BASTO), order++);
		scale.put(new Card(7, Suit.ESPADA), order++);
		scale.put(new Card(7, Suit.ORO), order++);
		addWithSameOrder(scale, 3, order);
		order++;
		addWithSameOrder(scale, 2, order);
		order++;
		scale.put(new Card(1, Suit.ORO), order);
		scale.put(new Card(1, Suit.COPA), order);
		order++;
		addWithSameOrder(scale, 12, order);
		order++;
		addWithSameOrder(scale, 11, order);
		order++;
		addWithSameOrder(scale, 11, order);
		order++;
		addWithSameOrder(scale, 10, order);
		order++;
		scale.put(new Card(7, Suit.BASTO), order);
		order++;
		scale.put(new Card(7, Suit.COPA), order);
		order++;
		addWithSameOrder(scale, 6, order);
		order++;
		addWithSameOrder(scale, 5, order);
		order++;
		addWithSameOrder(scale, 4, order);
		return scale;
	}

	private void addWithSameOrder(Map<Card, Integer> scale, int number, int order) {
		scale.put(new Card(number, Suit.ESPADA), order);
		scale.put(new Card(number, Suit.ORO), order);
		scale.put(new Card(number, Suit.BASTO), order);
		scale.put(new Card(number, Suit.COPA), order);
	}
	
}
