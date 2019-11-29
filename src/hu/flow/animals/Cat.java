package hu.flow.animals;

import hu.flow.base.AbstractAnimal;
import hu.flow.base.AttackInterface;
import hu.flow.base.CanFlyInterface;

public class Cat extends AbstractAnimal implements AttackInterface, CanFlyInterface {

    @Override
    public String getDeathScream() {
        return "\nVan még 8!";
    }

    public void meow() {
        System.out.println("Meow!");
    }

    public Cat(int age) {
        this.setLive(true);
        this.setAge(age);
        this.setForFun(true);
        this.setDomestic(true);
        this.setType("matka");
        this.isEdible(false);
        this.setForSafe(false);

    }

    @Override
    public int getAttackScore() {
        return 5;
    }

    @Override
    public void attack() {
        System.out.println("Meoooooooow/");
    }

    @Override
    public int getMaxHigh() {
        return 2;
    }
}

