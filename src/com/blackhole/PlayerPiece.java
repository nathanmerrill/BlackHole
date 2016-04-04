package com.blackhole;

public class PlayerPiece {
    private final Player player;
    private final Integer number;
    public PlayerPiece(Player player, Integer number){
        this.player = player;
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public Player getPlayer() {
        return player;
    }
}
