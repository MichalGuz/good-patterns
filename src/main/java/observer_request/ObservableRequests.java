package observer_request;

public interface ObservableRequests {
    void registerRequestObserver(ObserverOfRequests observerOfRequestst);
    void notifyRequestObserver();
    void removeRequestObserver(ObserverOfRequests observerOfRequests);
}
