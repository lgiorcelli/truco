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
		Deck deck = new Deck();
		deck.shuffle();
		
		Hand hand1 = new Hand(playerOne);
		Hand hand2 = new Hand(playerTwo);
		
		hand1.addCard(deck.getTopCard());
		hand2.addCard(deck.getTopCard());
		
		hand1.addCard(deck.getTopCard());
		hand2.addCard(deck.getTopCard());

		hand1.addCard(deck.getTopCard());
		hand2.addCard(deck.getTopCard());
		
		System.out.println(hand1);
		System.out.println(hand2);
		
		Table table = new Table(Arrays.asList(playerOne, playerTwo));
		 
		System.out.println(table);
	}
}
