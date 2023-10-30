package Map;

import Enemies.Enemy;
import Player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Room {

    private String name;

//    private List<Exit> exits;

    private ArrayList<Player> players;

    private ArrayList<Enemy> enemies;

    public Room(String name) {
        this.name = name;
//        this.exits = new Random(new List<Exit>());
        this.players = new ArrayList<Player>();
        this.enemies = new ArrayList<Enemy>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public ArrayList<Exit> getExits() {
//        return exits;
//    }

//    public void setExits(ArrayList<Exit> exits) {
//        this.exits = exits;
//    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }
}

// Silent Carpark, Abandoned Highrise, Busy Underground Metro,
// Snake Pit Bar, Secret Lab, Terrell Corp
