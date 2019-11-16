package observer_request;

import org.junit.Test;

public class RequestServiceTestSuite {
    @Test
    public void testUpdate() {
        // given
        RequestService company01 = new Company01RequestService();
        RequestService company10 = new Company10RequestService();
        RequestService company20 = new Company20RequestService();
    }
}
