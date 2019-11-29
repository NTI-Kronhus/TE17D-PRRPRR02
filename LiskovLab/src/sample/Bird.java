package sample;

import java.awt.color.ICC_ColorSpace;

public class Bird extends Animal {

    public Bird(String color) {
        super(color);
    }

    @Override
    void speak() {
        System.out.println("Bird is chirping!");
    }

    @Override
    void sleep() {
        System.out.println("Bird is sleeping!");
    }

    @Override
    void eat() {
        System.out.println("Bird is peck-peck-pecking away!");
    }
}
