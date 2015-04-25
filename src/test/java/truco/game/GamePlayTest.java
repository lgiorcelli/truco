package truco.game;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

import truco.model.Deck;
import truco.model.Player;

public class GamePlayTest {

	// Lexico:
	// Truco: definicion del tipo de jueg que se va a jugar, incluye las reglas, el orden de juego, las cartas, etc
	// Game: Una partida definida con usuarios elegidos. Tiene el acumulado de puntos de cada equipo/jugador
	// Round: Cada una de las rondas que se dan de un Game en particular. Esta incluye las 3 cartas q recibe cada jugador. 
	
	@Test
	public void createNewMatch() {
		// Given: A defined set of rules for game Truco
		
		// When: two players want to start a new game
		Player playerOne = new Player("player1");
		Player playerTwo = new Player("player2");
		Game game = Truco.create(playerOne, playerTwo);
		// A new Game is created for the 2 users
		
		// And a Deck is available
	}
	
	@Test
	public void testSeeCards() throws Exception {
		// Given a started game with another player
		Player playerOne = new Player("player1");
		Player playerTwo = new Player("player2");
		Game game = new Game(playerOne, playerTwo);
		// when i ask for my cards
		Hand playerOneHand = game.getHand(playerOne);
		// then i see the 3 cards assigned to me
		Assert.assertEquals(new Integer(3), playerOneHand.size());
		Assert.assertEquals(playerOne, playerOneHand.getPlayer());
	}


	@Test
	public void testSeeCardsOfPlayerTwo() throws Exception {
		// Given a started game with another player
		Player playerOne = new Player("player1");
		Player playerTwo = new Player("player2");
		Game game = new Game(playerOne, playerTwo);
		// when i ask for my cards
		Hand playerTwoHand = game.getHand(playerTwo);
		// then i see the 3 cards assigned to me
		Assert.assertEquals(new Integer(3), playerTwoHand.size());
		Assert.assertEquals(playerTwo, playerTwoHand.getPlayer());
	}
	
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
