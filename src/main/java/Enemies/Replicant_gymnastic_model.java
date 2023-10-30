package Enemies;

public class Replicant_gymnastic_model extends Enemy {

    private String name;


    public Replicant_gymnastic_model(int hp, String name) {
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
