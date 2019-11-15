package observer_request;

import java.util.ArrayDeque;
import java.util.Queue;

public class RequestService implements ObservableRequest{
    private final Queue<String> reqests;
    private final String customersId;

    public RequestService(String customersId) {
        reqests = new ArrayDeque<>();
        this.customersId = customersId;
    }

    private void addRequest(String request) {
        reqests.add(request);
    }
}
