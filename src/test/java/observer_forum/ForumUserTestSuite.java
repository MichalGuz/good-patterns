package observer_forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        // given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolForum = new JavaToolsForumTopic();

        ForumUser martinNovak = new ForumUser("Martin Novak");
        ForumUser adamAdamski = new ForumUser("Adam Adamski");
        ForumUser evaSmith = new ForumUser("Eva Smith");

        javaHelpForum.registerObserver(martinNovak);
        javaToolForum.registerObserver(martinNovak);

        javaHelpForum.registerObserver(adamAdamski);
        javaToolForum.registerObserver(evaSmith);

        // when
        javaHelpForum.addPost("Post 1");
        javaHelpForum.addPost("Post 2");
        javaHelpForum.addPost("Post 3");
        javaToolForum.addPost("Post 4");
        javaToolForum.addPost("Post 5");

        // then
        Assert.assertEquals(5, martinNovak.getUpdatesCount());
        Assert.assertEquals(3, adamAdamski.getUpdatesCount());
        Assert.assertEquals(2, evaSmith.getUpdatesCount());

    }
}
