package hu.flow.animals;

import hu.flow.base.AbstractAnimal;
import hu.flow.base.AttackInterface;

public class Dog extends AbstractAnimal implements AttackInterface {
    public static boolean underAttack = false;

    @Override
    public String getDeathScream() {
        return "\nWau";
    }

    public Dog (int age) {
        this.setLive(true);
        this.setAge(age);
        this.setForFun(true);
        this.setDomestic(true);
        this.setType("kutya");
        this.isEdible(false);
        this.setForSafe(true);
        this.setLiveScore(100);
    }


    @Override
    //Ide implementálható feltétel is
    public int getAttackScore() {
        if(getAge()<1) return 0;
        if (getAge()>9) return 10;
        else return 15;
    }

    @Override
    public void attack() {
        System.out.println("Wauuuuuuuu");
        underAttack = true;
    }
}
