package observer_request;

public interface ObservableRequests {
    void registerObserverOfRequestsregisterObserverOfRequestsregisterObserverOfRequests(ObserverOfRequests observerOfRequests);
    void notifyObserverOfRequests();
    void removeRequestObserver(ObserverOfRequests observerOfRequests);
}
