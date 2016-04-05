package com.blackhole.players;

import com.blackhole.BlackHoleMap;
import com.blackhole.Player;
import game.maps.gridmaps.GridPoint;

import java.util.List;
import java.util.Random;

public class RandomPlayer extends Player {
    @Override
    public GridPoint placePiece(int pieceNumber, BlackHoleMap map) {
        List<GridPoint> emptyLocations = map.emptyLocations();
        return emptyLocations.get(new Random().nextInt(emptyLocations.size()));
    }
}
