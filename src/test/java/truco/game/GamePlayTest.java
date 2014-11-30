package truco.game;

import java.util.Arrays;

import org.junit.Test;

import truco.model.Deck;
import truco.model.Player;

public class GamePlayTest {
	

	@Test
	public void test() throws Exception {
		
		Player playerOne = new Player("player1");
		Player playerTwo = new Player("player2");
		Deck deck = Deck.newSpanishDeck().shuffle();

		HandBuilder p1Builder = new HandBuilder(playerOne);
		HandBuilder p2Builder = new HandBuilder(playerTwo);
		
		
		p1Builder.addCard(deck.getTopCard());
		p2Builder.addCard(deck.getTopCard());
		
		p1Builder.addCard(deck.getTopCard());
		p2Builder.addCard(deck.getTopCard());

		p1Builder.addCard(deck.getTopCard());
		p2Builder.addCard(deck.getTopCard());
		
		Hand hand1 = p1Builder.build();
		Hand hand2 = p2Builder.build();
		System.out.println(hand1);
		System.out.println(hand2);
		
		Table table = new Table(Arrays.asList(playerOne, playerTwo));
		 
		System.out.println(table);
		
		
	}
}
