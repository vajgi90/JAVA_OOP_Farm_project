package hu.flow.base;

public abstract class AbstractHuman extends Creature {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
