package singleton_token;

import org.junit.Test;

public class TokenKeyTestSuite {
    @Test
    public void testGetTokenKey() {
        // given
        TokenKey tokenKey = new TokenKey();

        // when
        tokenKey.key(new String("78ad32feg45KW2"));
        String key = tokenKey.getTokenKey();
    }
}