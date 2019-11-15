package observer_request;

public interface ObservableRequests {
    void registerObserverOfRequests(ObserverOfRequests observerOfRequests);
    void notifyObserverOfRequests();
    void removeObserverOfRequests(ObserverOfRequests observerOfRequests);
}
