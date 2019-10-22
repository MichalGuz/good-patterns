package strategy_social_media;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public void share() {
        System.out.println("Facebook");
    }
}
