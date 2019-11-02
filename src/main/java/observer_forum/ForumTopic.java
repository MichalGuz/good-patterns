package observer_forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic {
    private final String name;
    private final List<String> messages;

    public ForumTopic(String name) {
        this.name = name;
        this.messages = new ArrayList<>();
    }

    public void addPost(String post) {
        messages.add(post);
    }
}
