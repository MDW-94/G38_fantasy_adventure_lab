package Map;

import java.util.ArrayList;

public class Quest {

    private ArrayList<Room> rooms;

    public Quest() {
        this.rooms = new ArrayList<Room>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}


// completed when array of rooms is empty