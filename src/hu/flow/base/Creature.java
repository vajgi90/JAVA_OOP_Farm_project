package hu.flow.base;

public abstract class Creature {

    private boolean live;
    private int age;
    private int liveScore;



    //A metódus nevébe is bele kell írni, hogy abstrat, ezzel jelzed, hogy ez egy test nélküli metódus.
    public abstract String getDeathScream();

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLiveScore() {
        return liveScore;
    }

    public void setLiveScore(int liveScore) {
        this.liveScore = liveScore;
    }
}
