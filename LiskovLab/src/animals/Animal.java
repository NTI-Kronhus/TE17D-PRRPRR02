package animals;

public abstract class Animal {

    private String _color;

    private String _description;

    public Animal(String color, String description)
    {
        _color = color;
        _description = description;
    }

    public abstract void speak();

    public abstract void sleep();

    public abstract void eat();

    public abstract void performMotions();

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public String getDescription() {
        return _description;
    }

}
