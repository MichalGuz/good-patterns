package observer_request;

public class CustomerAssistant implements ObserverOfRequests {
    private final String assistantName;
    private int requestCounter;

    public CustomerAssistant(String assistantName) {
        this.assistantName = assistantName;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public int getRequestCounter() {
        return requestCounter;
    }
}
