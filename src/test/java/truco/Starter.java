package truco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import truco.game.Game;
import truco.game.Truco;
import truco.model.Player;

public class Starter {

	public static void main(String[] args) throws Exception {
		new Starter().start();
	}
	
	public void start() throws Exception {
		Player playerOne = new Player("player1");
		Player playerTwo = new Player("player2");
		Game game = Truco.create(playerOne, playerTwo);
		System.out.println( game.getHand(playerOne));
		readFromConsole();
	}

	private void readFromConsole() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        String line = br.readLine();
		System.out.println(line);
	}
	

}
