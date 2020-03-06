public class Subscriber implements IObserver {

    String _name;

    public Subscriber(String name) {
        this._name = name;
    }

    @Override
    public void update(String title) {
        System.out.println("new video for you "+ _name + " named: " + title);
    }
}
