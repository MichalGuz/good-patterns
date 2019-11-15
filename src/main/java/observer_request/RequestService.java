package observer_request;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RequestService implements ObservableRequests {
    private final Queue<String> requests;
    private final String customersId;
    private final List<ObserverOfRequests> observers;

    public RequestService(String customersId) {
        requests = new ArrayDeque<>();
        this.customersId = customersId;
        observers = new ArrayList<>();
    }

    private void addRequest(String request) {
        requests.add(request);
        notifyObserverOfRequests();
    }

    public Queue<String> getRequests() {
        return requests;
    }

    public String getCustomersId() {
        return customersId;
    }

    @Override
    public void registerObserverOfRequests(ObserverOfRequests observerOfRequests) {
        observers.add(observerOfRequests);
    }

    @Override
    public void notifyObserverOfRequests() {
        for(ObserverOfRequests observerOfRequests: observers) {
            observerOfRequests.update(this);
        }
    }

    @Override
    public void removeObserverOfRequests(ObserverOfRequests observerOfRequests) {
        observers.remove(observerOfRequests);
    }
}
