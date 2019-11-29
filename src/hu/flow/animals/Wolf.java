package hu.flow.animals;

import hu.flow.base.AbstractAnimal;
import hu.flow.base.AttackInterface;

public class Wolf extends AbstractAnimal implements AttackInterface {


    public Wolf (int age) {
        this.setLive(true);
        this.setAge(age);
        this.setForFun(false);
        this.setDomestic(false);
        this.setType("kutya");
        this.isEdible(false);
        this.setForSafe(false);
        this.setLiveScore(200);
    }
    @Override
    public String getDeathScream() {
        return "Brrr";
    }

    @Override
    public int getAttackScore() {
        return 20;
    }

    @Override
    public void attack() {
        System.out.println("Silence I kill you");
    }
}
