package com.tuing.strategy.v2;

/**
 * 策略模式 : 將行為封裝起來, 讓他們可以互相使用
 */
public class ZombieStrategy {
    public static void main(String[] args) {
        NormalZombie normalZombie = new NormalZombie(new WeaponAttack(), new SlotMovie());
        normalZombie.display();
        normalZombie.attack();
        normalZombie.movie();
    }
}

//殭屍
abstract class Zombie{

    Attack attack;
    Movie movie;

    public Zombie(Attack attack, Movie movie) {
        this.attack = attack;
        this.movie = movie;
    }

    abstract void display(); //定義外觀
    abstract void attack(); //定義攻擊
    abstract void movie(); //定義移動


}

class NormalZombie extends Zombie{

    public NormalZombie(Attack attack, Movie movie) {
        super(attack, movie);
    }

    @Override
    void display() {
        System.out.println("I am NormalZombie....");
    }

    @Override
    void attack() {
        attack.attack();
    }

    @Override
    void movie() {
        movie.movie();
    }
}


//行為類
interface Attack {
    void attack();
}

interface Movie {
    void movie();
}

class HitAttack implements Attack {
    @Override
    public void attack() { System.out.println("HitAttack"); }
}

class WeaponAttack implements Attack {
    @Override
    public void attack() { System.out.println("WeaponAttack"); }
}

class SlotMovie implements Movie{
    @Override
    public void movie() { System.out.println("SlotMovie"); }
}

class QuickMovie implements Movie{
    @Override
    public void movie() { System.out.println("QuickMovie"); }
}







