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
}
