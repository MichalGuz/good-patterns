package strategy_social_media;

public class YGeneretion extends User {
    public YGeneretion(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
