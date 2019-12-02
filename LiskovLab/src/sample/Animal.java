package sample;

public abstract class Animal {

    public String _color;

    public Animal(String color)
    {
        _color = color;
    }

    abstract void speak();

    abstract void sleep();

    abstract void eat();

    public String getColor() {
        return _color;
    }

    public void walk() {
        System.out.println("Walking");
    }
}
