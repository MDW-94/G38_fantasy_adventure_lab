package Enemies;

public class Mercenary extends Enemy {

    private String name;

    public Mercenary(int hp, String name) {
        super(hp);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
