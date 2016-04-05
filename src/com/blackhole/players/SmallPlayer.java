package com.blackhole.players;

import com.blackhole.BlackHoleMap;
import com.blackhole.Player;
import com.blackhole.PlayerPiece;
import game.maps.gridmaps.GridPoint;
import game.maps.gridmaps.ReadonlyShapedGridMap;

import java.util.Comparator;

public class SmallPlayer extends Player {
    @Override
    public GridPoint placePiece(int pieceNumber, BlackHoleMap map) {
        return map.emptyLocations().stream().min(Comparator.comparingInt(i -> map.getScore(i, this))).get();
    }
}
