package hu.flow.base;

public interface AttackInterface {
    //Interface-be meglehet adni láthatóságot de nem kötelező megadni, ha nem írsz oda semmit akkor is public lesz

    //Lehet adattagot lérehozni, de az mindenképp constans lesz public static final.
    int getAttackScore();

    void attack();
}
