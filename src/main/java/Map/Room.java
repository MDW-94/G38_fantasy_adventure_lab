package Map;

import Enemies.Enemy;
import Player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Room {

    private String name;

    private List<Exit> exits;

    private ArrayList<Player> players;

    private ArrayList<Enemy> enemies;

    public Room(String name) {
        this.name = name;
        this.exits = new ArrayList<Exit>();
        this.players = new ArrayList<Player>();
        this.enemies = new ArrayList<Enemy>();
        createRoomExits();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public void setExits(ArrayList<Exit> exits) {
        this.exits = exits;
    }

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

    public void createRoomExits(){
        Random randomNumber = new Random();
        int exitsMade = randomNumber.nextInt(3) + 1;

        Exit[] exitTypes = Exit.values();

        while ( exits.size() <= exitsMade ) {
            int exitSelected = randomNumber.nextInt(4);

                if(!exits.contains(exitTypes[exitSelected])){
                    exits.add(exitTypes[exitSelected]);
            }
        }
    }


}

// Silent Carpark, Abandoned Highrise, Busy Underground Metro,
// Snake Pit Bar, Secret Lab, Terrell Corp
// make room name shuffle the list of names and select the first one in the list