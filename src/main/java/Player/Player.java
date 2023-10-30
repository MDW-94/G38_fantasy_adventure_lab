package Player;

public abstract class Player {

    private String name;

    private int hp;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public void takeDamage(int damage){
        hp -= damage;
        if(hp <= 0) {
            System.out.println("- Player Retired -");
        }
    }

    public void beHealed(int health){
        hp += health;
//        if(hp = ){
//            System.out.println("- Player Fully Healed! -");
//        }
//        Would need a means of recording the 'total' hp a player has
    }


}
