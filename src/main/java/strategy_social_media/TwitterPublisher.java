package strategy_social_media;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public void share() {
        System.out.println("Twitter");
    }
}
