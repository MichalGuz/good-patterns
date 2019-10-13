package singleton_token;

import org.junit.Assert;
import org.junit.Test;

public class TokenKeyTestSuite {
    private static TokenKey tokenKey;
    @Test
    public void testGetTokenKey() {
        // given
        // nothing

        // when
        TokenKey.getInstance().key("78ad32feg45KW2");
        String key = TokenKey.getInstance().getTokenKey();

        // then
        Assert.assertEquals("78ad32feg45KW2", key);
    }
}