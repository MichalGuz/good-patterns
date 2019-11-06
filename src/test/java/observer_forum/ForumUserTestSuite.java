package observer_forum;

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
        javaHelpForum.registerObserver(adamAdamski);
        javaHelpForum.registerObserver(evaSmith);

        // when
    }
}
