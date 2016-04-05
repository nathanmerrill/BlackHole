package com.blackhole.players;

import com.blackhole.BlackHoleMap;
import com.blackhole.Player;
import com.blackhole.PlayerPiece;
import game.maps.gridmaps.GridPoint;
import game.maps.gridmaps.ReadonlyShapedGridMap;

import java.util.Comparator;

public class LargePlayer extends Player {
    @Override
    public GridPoint placePiece(int pieceNumber, BlackHoleMap map) {
        return map.emptyLocations().stream().max(Comparator.comparingInt(i -> map.getScore(i, this))).get();
    }
}
