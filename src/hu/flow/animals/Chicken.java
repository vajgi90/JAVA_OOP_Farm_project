package hu.flow.animals;

import hu.flow.base.AbstractAnimal;
import hu.flow.base.CanFlyInterface;

public class Chicken extends AbstractAnimal implements CanFlyInterface {
    @Override
    public String getDeathScream() {
        return "";
    }

    public Chicken (int age) {
        this.setLive(true);
        this.setAge(age);
        this.setForFun(true);
        this.setDomestic(true);
        this.setType("csirke");
        this.isEdible(true);
        this.setForSafe(false);
        this.setLiveScore(1);
    }

    @Override
    public int getMaxHigh() {
        return 1;
    }
}
