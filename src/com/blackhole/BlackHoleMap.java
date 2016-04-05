package com.blackhole;

import game.maps.gridmaps.GridPoint;
import game.maps.gridmaps.TriangularHexagonMap;

public class BlackHoleMap extends TriangularHexagonMap<PlayerPiece>{
    public BlackHoleMap(int size){
        super(size);
    }

    public int getScore(GridPoint point, Player player){
        int score = 0;
        for (GridPoint neighbor: getNeighbors(point)){
            PlayerPiece piece = get(point);
            if (piece != null) {
                if (piece.getPlayer().equals(player)) {
                    score += piece.getNumber();
                } else {
                    score -= piece.getNumber();
                }
            }
        }
        return score;
    }
}
