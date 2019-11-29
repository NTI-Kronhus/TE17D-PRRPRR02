package sample;

public class Hedgehog extends Animal {

    public Hedgehog(String color) {
        super(color);
    }

    @Override
    void speak() {
        System.out.println("Hedgehog is squeeking!");
    }

    @Override
    void sleep() {
        System.out.println("Hedgehog is napping!");
    }

    @Override
    void eat() {
        System.out.println("Hedgehog is omnomnoming!");
    }
}
