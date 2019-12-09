package sample;

public class Hedgehog extends Animal {

    public Hedgehog(String color) {
        super(color);
    }

    void speak() {
        System.out.println("Hedgehog is squeeking!");
    }

    void sleep() {
        System.out.println("Hedgehog is napping!");
    }

    void eat() {
        System.out.println("Hedgehog is omnomnoming!");
    }

    @Override
    public void fly() {
        //not applicable!
    }

    @Override
    public void trot() {
        System.out.println("Hedgehog is trotting!");
    }

    @Override
    public void skip() {
        System.out.println("Hedgehog is skipping and hopping!");
    }

    @Override
    public void slither() {
        //not applicable!
    }

    @Override
    public void jump() {
        //not applicable!
    }

    @Override
    public void swim() {
        System.out.println("Hedgehog is stalking snaek!");
    }

    @Override
    public void run() {
        //not applicable!
    }

    @Override
    public void roll() {
        System.out.println("Sonic is rolling so fast!");
    }

    @Override
    public void sit() {
        System.out.println("Hedgehog sitting for tea!");
    }

    @Override
    public void dash() {
        System.out.println("Sonic the speedster!");
    }
}
