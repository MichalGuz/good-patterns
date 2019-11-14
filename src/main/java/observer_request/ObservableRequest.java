package observer_request;

public interface ObservableRequest {
    void registerRequestObserver(ObserverRequests observerRequestst);
    void notifyRequestObserver();
    void removeRequestObserver(ObserverRequests observerRequests);
}
