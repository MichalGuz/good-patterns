package strategy_social_media;

import org.junit.Assert;
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
        Assert.assertEquals("Facebook", millenialsFavouriteSocialMedia);
        Assert.assertEquals("Twitter", yGenerationFavouriteSocialMedia);
        Assert.assertEquals("Snapchat", zGenerationFavouriteSocialMedia);
        System.out.println(millenials.getName() + " usually uses " + millenialsFavouriteSocialMedia);
        System.out.println(yMan.getName() + " usually uses " + yGenerationFavouriteSocialMedia);
        System.out.println(zMan.getName() + " usually uses " + zGenerationFavouriteSocialMedia);
    }

    @Test
    public void testIndividualPreferencesAboutSocialMedia() {
        // given
        Millenials millenials = new Millenials("Neo");
    }
}
