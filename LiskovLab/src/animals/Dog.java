package animals;

import animal_interfaces.IDog;

public class Dog extends Animal implements IDog {

    public Dog(String color, String description) {
        super(color, description);
    }

    public void speak() {
        System.out.println("Dog is barking!");
    }

    public void sleep() {
        System.out.println("Dog is sleeping!");
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void performMotions() {
        dash();
        jump();
        roll();
        run();
        sit();
        skip();
        sneak();
        swim();
        trot();
        walk();
    }

    @Override
    public void dash() {
        System.out.println("Dog is dashing!");
    }

    @Override
    public void jump() {
        System.out.println("Dog is jumping!");
    }

    @Override
    public void roll() {
        System.out.println("Dog rolling over!");
    }

    @Override
    public void run() {
        System.out.println("Dog is running!");
    }

    @Override
    public void sit() {
        System.out.println("Dog is sitting!");
    }

    @Override
    public void skip() {
        System.out.println("Dog is skipping and hopping!");
    }

    @Override
    public void sneak() {
        System.out.println("Dog is sneaking!");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming!");
    }

    @Override
    public void trot() {
        System.out.println("Dog is trotting!");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking!");
    }
}
