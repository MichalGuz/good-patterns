package observer_request;

import java.util.ArrayDeque;
import java.util.Queue;

public class RequestService {
    private final Queue<String> reqests;
    private final String customersId;

    public RequestService(String customersId) {
        reqests = new ArrayDeque<>();
        this.customersId = customersId;
    }
}
