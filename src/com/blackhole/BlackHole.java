package com.blackhole;

import game.Game;
import game.Scoreboard;
import game.maps.gridmaps.GridPoint;
import game.maps.gridmaps.TriangleMap;

public class BlackHole extends Game<Player> {

    private final static int BOARD_SIZE = 6;
    private final static int PIECE_MAX = ((BOARD_SIZE + 1)*BOARD_SIZE/2 -1)/2;

    private final TriangleMap<PlayerPiece> map;
    public BlackHole(){
        map = new TriangleMap<>(6);
    }

    @Override
    public Scoreboard<Player> run() {
        for (int currentPiece = 1; currentPiece <= PIECE_MAX; currentPiece++){
            for (Player player: players){
                GridPoint location = player.placePiece(currentPiece, map);
                map.put(new PlayerPiece(player, currentPiece), location);
            }
        }
        GridPoint finalPiece = map.emptyLocations().get(0);
        Scoreboard<Player> scoreboard = new Scoreboard<>(directory);
        for (Player player: players){
            int score = map.getNeighbors(finalPiece).stream().map(map::get).mapToInt(PlayerPiece::getNumber).sum();
            scoreboard.addScore(player, score);
        }
        return scoreboard;
    }
}
