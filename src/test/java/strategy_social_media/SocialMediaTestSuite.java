package strategy_social_media;

import org.junit.Test;

public class SocialMediaTestSuite {
    @Test
    public void testDefaultSocialMediaMessagesSending() {
        // given
        Millenials millenials = new Millenials("Neo");
        YGeneretion yMan = new YGeneretion("Justin");
        ZGeneretion zMan = new ZGeneretion("Stormzy");

        // when
        String millenialsFavouriteSocialMedia = millenials.sendMessage();
        String yGenerationFavouriteSocialMedia = yMan.sendMessage();
        String zGenerationFavouriteSocialMedia = zMan.sendMessage();

        // then
      }
}
