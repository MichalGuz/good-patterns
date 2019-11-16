package observer_request;

import org.junit.Assert;
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
        company01.addRequest("Request of company01 - system failure");
        company10.addRequest("Request of company10 - unconfirmed payment");
        company20.addRequest("Request of company20 - unknown user");
        company01.addRequest("Request of company01 - password error");
        company10.addRequest("Request of company10 - database failure");

        // then
        Assert.assertEquals(4, ordinaryAssistant.getRequestCounter());
        Assert.assertEquals(3, specialAssistant.getRequestCounter());
    }
}
