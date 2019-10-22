package strategy_social_media;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public void share() {
        System.out.println("Snapchat");
    }
}
