package singleton_token;

public final class TokenKey {
    private static TokenKey tokenKeyInstance = null;
    private String tokenKey = "";

    private TokenKey(){};

    public static TokenKey getInstance(){
        synchronized(TokenKey.class) {
            if (tokenKeyInstance == null) {
                if (tokenKeyInstance == null) {
                    tokenKeyInstance = new TokenKey();
                }
            }
        }
        return tokenKeyInstance;
    }

    public void key(String key){
        tokenKey = key;
        System.out.println("Key [" + key + "]");
    }

    public String getTokenKey(){
        return tokenKey;
    }
}
