package singleton_token;

public final class TokenKey {
    private String tokenKey = "";

    public void key(String key){
        tokenKey = key;
        System.out.println("Key [" + key + "]");
    }
}
