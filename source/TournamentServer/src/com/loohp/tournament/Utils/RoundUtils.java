package com.loohp.tournament.Utils;

import java.util.ArrayList;
import java.util.List;

import com.loohp.tournament.TournamentServer;
import com.loohp.tournament.Group.Group;
import com.loohp.tournament.Player.Player;
import com.loohp.tournament.Round.Round;

public class RoundUtils {
	
	public static String getRoundNameFromPlayerCount(int playerCount) {
		switch (playerCount) {
		case 2:
			return TournamentServer.getInstance().getLang().get("Common.Rounds.Final").replace("%s", playerCount + "");
		case 4:
			return TournamentServer.getInstance().getLang().get("Common.Rounds.SemiFinal").replace("%s", playerCount + "");
		case 8:
			return TournamentServer.getInstance().getLang().get("Common.Rounds.QuaterFinal").replace("%s", playerCount + "");
		default:
			return TournamentServer.getInstance().getLang().get("Common.Rounds.Others").replace("%s", playerCount + "");
		}
	}
	
	public static String getRoundNameFromRoundNumber(int roundNumber) {
		return getRoundNameFromPlayerCount((int) Math.pow(2, roundNumber + 1));
	}
	
	public static List<Player> getPlayersInRound(Round round) {
		List<Player> players = new ArrayList<Player>();
		for (Group group : round.getGroups()) {
			if (group.getHome() != null) {
				players.add(group.getHome());
			}
			if (group.getAway() != null) {
				players.add(group.getAway());
			}
		}
		return players;
	}
}
