package observer_request;

import sun.util.calendar.BaseCalendar;

import java.util.Date;

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

    @Override
    public void update(RequestService requestService) {
        requestCounter++;
        System.out.println(assistantName + " check new request of " + requestService.getCustomersId() + " client; request number" + requestService.getCustomersId() + "-" + new Date() + "-" + requestCounter);
    }
}
