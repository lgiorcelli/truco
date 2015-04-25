package truco.game;

import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import truco.game.exception.InvalidTeamsException;
import truco.model.Card;
import truco.model.Player;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

public class Table {
//Layout ?
	private Multimap<Player, Card> spots = ArrayListMultimap.create();
	private List<Player> teamA = Lists.newArrayList();
	private List<Player> teamB = Lists.newArrayList();
	
	public static Table withSpots(Integer spotsNumber) {
		return new Table(spotsNumber);
	}
	
	private Table(Integer spotsNumber) {
		
	}
	
	public Table(Collection<Player> players) throws InvalidTeamsException {
		spots = ArrayListMultimap.create();
		// TODO Esto no parece ser responsabilidad de una mesa =P, pensar en un match config o algo asi
		validatePlayers(players);
		assignTeams(players);
	}

	private void validatePlayers(Collection<Player> players) throws InvalidTeamsException {
		if (players.isEmpty()) {
			throw new InvalidTeamsException("There must be at least one player");
		}
		if (players.size() % 2 != 0) {
			throw new InvalidTeamsException("There must be even number of players");
		}
		//TODO Validar repetidos
	}

	private void assignTeams(Collection<Player> players) {
		boolean goesToTeamA = true;
		for (Player player : players) {
			if (goesToTeamA) {
				teamA.add(player);
			} else {
				teamB.add(player);
			}
			goesToTeamA = !goesToTeamA;
		}
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public void assignPlaceAt(int spotNumber, Player player) {
		assignTeam(spotNumber, player);
	}

	private void assignTeam(int spotNumber, Player player) {
		if (spotNumber % 2 == 0) {
			teamA.add(player);
		} else {
			teamB.add(player);
		}
	}

}
