package observer_request;

public interface ObservableRequest {
    void registerRequestObserver(ObserverOfRequests observerOfRequestst);
    void notifyRequestObserver();
    void removeRequestObserver(ObserverOfRequests observerOfRequests);
}
