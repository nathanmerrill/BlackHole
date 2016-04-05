package com.blackhole;

import com.blackhole.players.GameDirectory;
import game.GameManager;
import game.tournaments.EloTournament;

public class Main {

    public static void main(String[] args) {
        GameManager<Player> gameManager = new GameManager<>(BlackHole::new, GameDirectory.get()).maxPlayerCount(2);
        EloTournament<Player> tournament = new EloTournament<>(gameManager, 100);
        System.out.print(tournament.run());
    }
}
