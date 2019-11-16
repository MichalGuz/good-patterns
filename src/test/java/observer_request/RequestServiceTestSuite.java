package observer_request;

import org.junit.Test;

public class RequestServiceTestSuite {
    @Test
    public void testUpdate() {
        // given
        RequestService company01 = new Company01RequestService();
        RequestService company10 = new Company10RequestService();
        RequestService company20 = new Company20RequestService();
        CustomerAssistant ordinaryAssistant = new CustomerAssistant("Ordinary");
        CustomerAssistant specialAssistant = new CustomerAssistant("Special");
        company01.registerObserverOfRequests(ordinaryAssistant);
        company01.registerObserverOfRequests(specialAssistant);
        company10.registerObserverOfRequests(ordinaryAssistant);
        company20.registerObserverOfRequests(specialAssistant);

        // when
        company01.
    }
}
