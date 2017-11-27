package com.mtm.demo.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class GamePlayer implements Serializable {

    private static final long serialVersionUID = 1L;
    int gameLevel;
    int health;
    ArrayList<String> powers = new ArrayList<String>();

    public static void serialize(GamePlayer player) throws IOException {
        FileOutputStream fos = new FileOutputStream("serial");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(player);
        oos.flush();
        oos.close();
    }

    public static GamePlayer deserialize() throws IOException, ClassNotFoundException {
        GamePlayer player;
        FileInputStream fis = new FileInputStream("serial");
        ObjectInputStream ois = new ObjectInputStream(fis);
        player = (GamePlayer) ois.readObject();
        ois.close();
        return player;
    }

    /**
     * toString() is overridden just to see the object in a readable format when its put in a Sysout
     * statement, rather than the default hashcode
     **/
    public String toString() {
        return "Player Level: " + this.gameLevel + ", PlayerHealth: " + this.health;
    }

}
