package observer_request;

public class CustomerAssistant implements ObserverOfRequests {
    private final String assistantName;
    private int requestCounter;

    public CustomerAssistant(String assistantName) {
        this.assistantName = assistantName;
    }
}
