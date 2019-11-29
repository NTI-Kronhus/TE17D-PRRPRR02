package sample;

public abstract class Animal {

    public String _color;

    public Animal(String color)
    {
        _color = color;
    }

    public String getColor()
    {
        return _color;
    }

    abstract void speak();

    abstract void sleep();

    abstract void eat();
}
