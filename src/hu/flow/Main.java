package hu.flow;

import hu.flow.animals.*;
import hu.flow.base.AttackInterface;
import hu.flow.base.Creature;

import java.util.Random;
import java.util.Scanner;


public class Main {
    static Random rnd = new Random();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Creature[] creatures = new Creature[100];
        generateAnimals(creatures);
        /*
        60% csirke,
        5%pulyka,
        5%macska,
        10%kutya,
        20%wolf
         */

        while(true) {
            int number = rnd.nextInt(100);
            if(number < 10) {
                Wolf attackerWolf = null;
                for (int i = 0; i < creatures.length ; i++) {
                    if(creatures[i] instanceof Wolf) {
                        //Ezzel kiemeljük az első tömbben lévő farkast és dedikáljuk támadónak.
                        //A creatures i ősosztálya a farkasnak, áttudjuk kasztolni farkassá,
                        attackerWolf = (Wolf) creatures[i];
                        break;
                    }
                }
                number = rnd.nextInt(creatures.length);
                Creature poorCreature = creatures[number];

                if(!poorCreature.isLive()) {
                    System.out.println("Dögevő");
                } else {
                    poorCreature.setLiveScore(poorCreature.getLiveScore() - attackerWolf.getAttackScore());
                    if (poorCreature.getLiveScore() <= 0) {
                        System.out.println("Prikázs, a devla adja rád az utolsó kabátot" + poorCreature.getDeathScream());
                    poorCreature.setLive(false);
                } else {
                        //Az instance of jó interface implementáció csekkolásra is

                        if (poorCreature instanceof AttackInterface) {
                            //AttackInt
                            //Interface ai = (AttackInterface) poorCreature; Ez egy polimorfikus dolog, az interface-szel mutatsz rá az adott utódosztályra, így már elérem az utód getattackscore metódusát
                            attackerWolf.setLiveScore(attackerWolf.getLiveScore() - ((AttackInterface) poorCreature).getAttackScore());
                            System.out.println("Neked is rohadjon meg az összes befőttöd!");
                        }
                    }
                    }

                scanner.nextLine();
            }

        }




        }
        static void generateAnimals(Creature[] creatures) {
            for (int i = 0; i < creatures.length ; i++) {
                int number = rnd.nextInt(100);
                if(number < 60) {
                    creatures[i]=new Chicken(rnd.nextInt(3));
                } else if (number < 65) {
                    creatures[i]=new Turkey();
                } else if (number < 70) {
                    creatures[i] = new Cat(rnd.nextInt(15));
                } else if (number < 80) {
                    creatures[i] = new Dog(rnd.nextInt(20));
                } else {
                    creatures[i] = new Wolf(rnd.nextInt(20));
                }
        }
    }
}
