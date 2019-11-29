package hu.flow.base;

//Ha egy abstract osztályt örökítesz vagy absztraktá teszed az osztályod
//vagy implementálod az ős metódusait
public abstract class AbstractAnimal extends Creature {
    private String type;
    private boolean domestic;
    private boolean edible;
    private boolean forFun;
    private boolean forSafe;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    public boolean isEdible(boolean edible) {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public boolean isForFun() {
        return forFun;
    }

    public void setForFun(boolean forFun) {
        this.forFun = forFun;
    }

    public boolean isForSafe() {
        return forSafe;
    }

    public void setForSafe(boolean forSafe) {
        this.forSafe = forSafe;
    }
}
