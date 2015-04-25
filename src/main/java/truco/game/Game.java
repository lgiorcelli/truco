package truco.game;

import java.util.Map;

import truco.exception.InvalidMoveException;
import truco.model.Deck;
import truco.model.Player;

import com.google.common.collect.Maps;

public class Game {
	private Player playerOne;
	private Player playerTwo;
	private Map<Player, Hand> hands = Maps.newHashMap();
	private Table table;
	private Deck deck;
	public Game(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		table = Table.withSpots(2);
		table.assignPlaceAt(1, playerOne);
		table.assignPlaceAt(2, playerTwo);
		try {
			buildHand(playerOne, playerTwo);
		} catch (InvalidMoveException e) {
			throw new RuntimeException("Error inicializando juego", e);
		}
	}
	
	public Player getPlayerOne() {
		return playerOne;
	}
	
	public Player getPlayerTwo() {
		return playerTwo;
	}
	
	private void buildHand(Player playerOne, Player playerTwo)
			throws InvalidMoveException {
		deck = Deck.newSpanishDeck();

		HandBuilder p1Builder = new HandBuilder(playerOne);
		HandBuilder p2Builder = new HandBuilder(playerTwo);

		p1Builder.addCard(deck.getTopCard());
		p2Builder.addCard(deck.getTopCard());

		p1Builder.addCard(deck.getTopCard());
		p2Builder.addCard(deck.getTopCard());

		p1Builder.addCard(deck.getTopCard());
		p2Builder.addCard(deck.getTopCard());

		hands.put(playerOne, p1Builder.build());
		hands.put(playerTwo, p2Builder.build());
	}
	
	
	public Hand getHand(Player playerOne) {
		//validate player is in game
		return hands.get(playerOne);
	}
}