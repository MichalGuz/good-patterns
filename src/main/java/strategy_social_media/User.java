package strategy_social_media;

public class User {
    private final String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String  sendMessage() {
        return socialPublisher.share();
    }
}
