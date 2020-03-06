public interface ISubject {
    abstract void subscribe(IObserver sub);
    abstract void unSubscribe(IObserver sub);
    abstract void upload(String title);
    abstract void notifySubs(String title);
}
