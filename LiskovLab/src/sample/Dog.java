package sample;

public class Dog extends Animal {

    public Dog(String color) {
        super(color);
    }

    @Override
    void speak() {
        System.out.println("Dog is barking!");
    }

    @Override
    void sleep() {
        System.out.println("Dog is sleeping!");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating.");
    }
}
