/**
 * 
 */
package truco.game;

import truco.model.Player;

public class Truco {
	public static Game create(Player playerOne, Player playerTwo) {
		return new Game(playerOne, playerTwo);
	}
}