package factory_task;

public interface Task {
    void executeTask();

    String getTaskName();

    boolean isTaskExecuted();
}
