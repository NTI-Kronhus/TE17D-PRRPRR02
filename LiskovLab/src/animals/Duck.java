package animals;

import animal_interfaces.IDuck;

public class Duck extends Animal implements IDuck {

    public Duck(String color, String description) {
        super(color, description);
    }

    public void speak() {
        System.out.println("Duck is quacking!");
    }

    public void sleep() {
        System.out.println("Duck is sleeping!");
    }

    public void eat() {
        System.out.println("Duck is peck-peck-pecking away!");
    }

    @Override
    public void performMotions() {
        dash();
        fly();
        jump();
        run();
        sit();
        skip();
        sneak();
        swim();
        walk();
    }

    @Override
    public void dash() {
        System.out.println("Duck is dashing!");
    }

    @Override
    public void fly() {
        System.out.println("Duck is soaring majestically!");
    }

    @Override
    public void jump() {
        System.out.println("Duck is jumping for air!");
    }

    @Override
    public void run() {
        System.out.println("Duck is running!");
    }

    @Override
    public void sit() {
        System.out.println("Duck is sitting!");
    }

    @Override
    public void skip() {
        System.out.println("Duck is skipping and hopping!");
    }

    @Override
    public void sneak() {
        System.out.println("Duck is sneaky af!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming!");
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking!");
    }
}
