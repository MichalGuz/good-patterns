package observer_request;

public interface ObservableRequests {
    void registerObserverOfRequests(ObserverOfRequests observerOfRequestst);
    void notifyRequestObserver();
    void removeRequestObserver(ObserverOfRequests observerOfRequests);
}
