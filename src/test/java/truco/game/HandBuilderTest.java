package truco.game;

import org.junit.Assert;
import org.junit.Test;

import truco.model.Card;
import truco.model.Player;
import truco.model.Suit;

public class HandBuilderTest {

	@Test
	public void testCreateHand() {
		Player player = new Player("test");
		Card card1 = new Card(1, Suit.BASTO);
		Card card2 = new Card(2, Suit.BASTO);
		Card card3 = new Card(3, Suit.BASTO);
		HandBuilder builder = new HandBuilder(player);
		builder.addCard(card1);
		builder.addCard(card2);
		builder.addCard(card3);
		Hand hand = builder.build();
		Assert.assertNotNull(hand);
		Assert.assertEquals(card1, hand.takeCardAt(0));
		Assert.assertEquals(card2, hand.takeCardAt(0));
		Assert.assertEquals(card3, hand.takeCardAt(0));
		
	}

}

