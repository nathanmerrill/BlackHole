package com.blackhole.players;

import com.blackhole.Player;
import com.blackhole.PlayerPiece;
import game.maps.gridmaps.GridPoint;
import game.maps.gridmaps.ReadonlyShapedGridMap;

import java.util.List;
import java.util.Random;

public class RandomPlayer extends Player {
    @Override
    public GridPoint placePiece(int pieceNumber, ReadonlyShapedGridMap<PlayerPiece> map) {
        List<GridPoint> emptyLocations = map.emptyLocations();
        return emptyLocations.get(new Random().nextInt(emptyLocations.size()));
    }
}
