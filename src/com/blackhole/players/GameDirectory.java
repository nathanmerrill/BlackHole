package com.blackhole.players;

import com.blackhole.Player;
import game.Directory;

public class GameDirectory {
    private static final Directory<Player> directory = new Directory<>();
    static {
        directory.register(RandomPlayer.class, RandomPlayer::new);
        directory.register(LargePlayer.class, LargePlayer::new);
        directory.register(SmallPlayer.class, SmallPlayer::new);
    }
    public static Directory<Player> get(){
        return directory;
    }
}
