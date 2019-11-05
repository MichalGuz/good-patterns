package observer_forum;

public class ForumUser implements Observer {
    private final String userName;
    private int updatesCount;

    public ForumUser(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public int getUpdatesCount() {
        return updatesCount;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(userName + ": new message in topic " + forumTopic.getName() + "\n" + "(total: " + forumTopic.getMessages().size() + " messages.)");
        updatesCount++;
    }
}

