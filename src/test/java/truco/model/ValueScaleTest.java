package truco.model;

import org.junit.Assert;
import org.junit.Test;

import truco.model.Card;
import truco.model.Suit;
import truco.model.rules.ValueScale;

public class ValueScaleTest {

	@Test
	public void testValueScale() {
		ValueScale scale = new ValueScale();
		Assert.assertTrue(scale.isGreater(new Card(1, Suit.ESPADA), new Card(2, Suit.ESPADA)));
		
		Assert.assertFalse(scale.isGreater(new Card(4, Suit.ESPADA), new Card(4, Suit.BASTO)));
		
		Assert.assertTrue(scale.areEquals(new Card(4, Suit.ESPADA), new Card(4, Suit.BASTO)));
	}

}
