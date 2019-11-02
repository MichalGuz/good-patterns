package observer_forum;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver();
}
