package prototype_tasks;

import java.util.HashSet;
import java.util.Set;

public final class Board {
    private final String name;
    private final Set<TaskList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TaskList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for (TaskList list : lists) {
            s = s + list.toString() + "\n";
        }
        return  s;
    }
}

