package com.blackhole;

import game.maps.gridmaps.GridPoint;


public abstract class Player {

    public abstract GridPoint placePiece(int pieceNumber, BlackHoleMap map);
}
