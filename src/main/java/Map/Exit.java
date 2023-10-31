package Map;

public enum Exit {

    WEST("West"),
    EAST("East"),
    NORTH("North"),
    SOUTH("South");

    private String label;

    Exit(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
