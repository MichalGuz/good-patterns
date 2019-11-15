package observer_request;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RequestService implements ObservableRequests {
    private final Queue<String> reqests;
    private final String customersId;
    private final List<ObserverOfRequests> observers;

    public RequestService(String customersId) {
        reqests = new ArrayDeque<>();
        this.customersId = customersId;
        observers = new ArrayList<>();
    }

    private void addRequest(String request) {
        reqests.add(request);
    }

    @Override
    public void registerObserverOfRequests(ObserverOfRequests observerOfRequests) {
        observers.add(observerOfRequests);
    }

    @Override
    public void notifyRequestObserver() {
        for(ObserverOfRequests observerOfRequests: observers) {
            observerOfRequests.update(this);
        }
    }

    @Override
    public void removeRequestObserver(ObserverOfRequests observerOfRequests) {
        observers.remove(observerOfRequests);
    }
}
