import java.util.ArrayList;
import java.util.List;

public class Channel implements ISubject {

    List<IObserver> subscribers = new ArrayList<>();
    String _title;

    @Override
    public void subscribe(IObserver sub) {
        subscribers.add(sub);
    }

    @Override
    public void unSubscribe(IObserver sub) {
        subscribers.remove(sub);
    }

    @Override
    public void upload(String title) {
        _title = title;
        notifySubs(title);
    }

    @Override
    public void notifySubs(String title) {
        for (IObserver sub: subscribers) {
            sub.update(title);
        }
    }
}
