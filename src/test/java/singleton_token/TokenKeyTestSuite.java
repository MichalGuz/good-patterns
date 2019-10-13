package singleton_token;

import org.junit.Assert;
import org.junit.Test;

public class TokenKeyTestSuite {
    private static TokenKey tokenKey;
    @Test
    public void testGetTokenKey() {
        // given

        // when
        TokenKey
                key(new String("78ad32feg45KW2"));
        String key = TokenKey.getTokenKey();

        // then
        Assert.assertEquals("78ad32feg45KW2", key);
    }
}