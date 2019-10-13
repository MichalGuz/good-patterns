package singleton_token;

public final class TokenKey {
    private static TokenKey tokenKeyInstance = null;
    private String tokenKey = "";

    private TokenKey(){};

    public void key(String key){
        tokenKey = key;
        System.out.println("Key [" + key + "]");
    }

    public String getTokenKey(){
        return tokenKey;
    }
}
