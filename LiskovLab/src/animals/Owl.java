package animals;

import animal_interfaces.IOwl;

public class Owl extends Animal implements IOwl {

    public Owl(String color, String description) {
        super(color, description);
    }

    public void speak() {
        System.out.println("Owl is screeching!");
    }

    public void sleep() {
        System.out.println("Owl is sleeping!");
    }

    public void eat() {
        System.out.println("Owl is munching away!");
    }

    @Override
    public void performMotions() {
        fly();
        jump();
        run();
        sit();
        skip();
        walk();
    }

    @Override
    public void fly() {
        System.out.println("Owl is gliding stealthily!");
    }

    @Override
    public void jump() {
        System.out.println("Owl is jumping!");
    }

    @Override
    public void run() {
        System.out.println("Owl is running!?");
    }

    @Override
    public void sit() {
        System.out.println("Owl is sitting!");
    }

    @Override
    public void skip() {
        System.out.println("Owl is skipping and hopping!");
    }

    @Override
    public void walk() {
        System.out.println("Owl is walking like a boss!");
    }
}
