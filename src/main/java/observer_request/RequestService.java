package observer_request;

import observer_forum.Observer;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class RequestService implements ObservableRequest{
    private final Queue<String> reqests;
    private final String customersId;
    private final List<ObserverRequests> observers;

    public RequestService(String customersId) {
        reqests = new ArrayDeque<>();
        this.customersId = customersId;
    }

    private void addRequest(String request) {
        reqests.add(request);
    }

    @Override
    public void registerRequestObserver(ObserverRequests observerRequests) {
        observers.add(observerRequests);
    }
}
