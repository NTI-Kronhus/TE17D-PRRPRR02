package animals;

import animal_interfaces.IHedgehog;

public class Hedgehog extends Animal implements IHedgehog {

    public Hedgehog(String color, String description) {
        super(color, description);
    }

    public void speak() {
        System.out.println("Hedgehog is squeeking!");
    }

    public void sleep() {
        System.out.println("Hedgehog is napping!");
    }

    public void eat() {
        System.out.println("Hedgehog is omnomnoming!");
    }

    @Override
    public void performMotions() {
        dash();
        roll();
        sit();
        swim();
        trot();
        walk();
    }

    @Override
    public void dash() {
        System.out.println("Sonic is dashing at light speed!");
    }

    @Override
    public void roll() {
        System.out.println("Sonic is rolling to preserve speed!");
    }

    @Override
    public void sit() {
        System.out.println("Hedgehog is squatting!");
    }

    @Override
    public void swim() {
        System.out.println("Hedgehog is stalking a snaek!");
    }

    @Override
    public void trot() {
        System.out.println("Hedgehog is not always Sonic.");
    }

    @Override
    public void walk() {
        System.out.println("Hedgehog is walking!");
    }
}
