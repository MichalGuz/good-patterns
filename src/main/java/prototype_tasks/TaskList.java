package prototype_tasks;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    final private String name;
    final private List<Task> tasks = new ArrayList<>();

    public TaskList(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
