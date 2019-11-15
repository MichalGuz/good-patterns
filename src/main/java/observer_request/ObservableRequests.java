package observer_request;

public interface ObservableRequests {
    void registerObserverOfRequests(ObserverOfRequests observerOfRequests);
    void notifyRequestObserver();
    void removeRequestObserver(ObserverOfRequests observerOfRequests);
}
