package com.mtm.demo.serialization;

import java.io.IOException;

public class PlayGame {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GamePlayer player = new GamePlayer();
        player.gameLevel = 7;
        player.health = 50;
        player.powers.add("MediPack");
        player.powers.add("LaserGun");
        player.powers.add("FireBall");

        /** Write Object to file **/
        GamePlayer.serialize(player);

        /** Get the Object back from file **/
        GamePlayer newPlayer = GamePlayer.deserialize();

        System.out.println(newPlayer);
    }

}
