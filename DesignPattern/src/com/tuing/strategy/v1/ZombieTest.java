package com.tuing.strategy.v1;

public class ZombieTest {

    public static void main(String[] args) {

        AbstractZombie normalZombie = new NormalZombie();
        normalZombie.display();
        normalZombie.jump();
        normalZombie.attack();

        AbstractZombie leaderZombie = new LeaderZombie();
        leaderZombie.display();
        leaderZombie.jump();
        leaderZombie.attack();

        BigHeaderZombie bigHeaderZombie = new BigHeaderZombie();
        bigHeaderZombie.display();
        bigHeaderZombie.attack();

    }
}


abstract class AbstractZombie {

    private String name;

    public abstract void display();

    public void jump(){
        System.out.println("jump over to you");
    }

    public void attack(){
        System.out.println("normal attack");
    }

}

class NormalZombie extends AbstractZombie {

    @Override
    public void display() {
        System.out.println("i am normal zombie");
    }
}

class LeaderZombie extends AbstractZombie{

    @Override
    public void display() {
        System.out.println("i am leader zombie, holding a flag");
    }
}

class BigHeaderZombie extends AbstractZombie{

    @Override
    public void display() {
        System.out.println("i am zombie with Big Header");
    }

    @Override
    public void attack() {
//        super.attack();
        System.out.println("attack with hands");
    }
}






