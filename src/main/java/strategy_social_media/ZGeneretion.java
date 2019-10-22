package strategy_social_media;

public class ZGeneretion extends User {
    public ZGeneretion(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
