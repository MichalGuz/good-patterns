package factory_task;

import java.util.HashSet;
import java.util.Set;

public class ExecutedTaskCounter {
    Set<Integer> executedTasks = new HashSet<>();

    public void addExecution(boolean executedTask) {
        if (executedTask == true) {
            executedTasks.add(1);
        }
    }

    public int getNumberOfExecutedTasks() {
        return executedTasks.size();
    }
}
