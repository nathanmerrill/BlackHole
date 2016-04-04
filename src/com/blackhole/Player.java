package com.blackhole;

import game.maps.gridmaps.GridPoint;
import game.maps.gridmaps.ReadonlyShapedGridMap;


public abstract class Player {

    public abstract GridPoint placePiece(int pieceNumber, ReadonlyShapedGridMap<PlayerPiece> map);
}
