import Player.Player;

import java.util.ArrayList;

public class Party {

    private ArrayList<Player> party;
    private int treasureValue;

    public Party(ArrayList<Player> party, int treasureValue) {
        this.party = party;
        this.treasureValue = treasureValue;
    }

    public void addPlayerToParty(Player player){
        party.add(player);
    }

    public void removePlayerFromParty(Player player){
        party.remove(player);
    }






}
