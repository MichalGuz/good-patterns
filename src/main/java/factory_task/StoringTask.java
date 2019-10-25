package factory_task;

public class StoringTask implements Task  {
    private String taskName;
    private String whatToStore;
    private String whereToStore;
    private boolean executedTask;

    public StoringTask(String taskName, String whatToStore, String whereToStore) {
        this.taskName = taskName;
        this.whatToStore = whatToStore;
        this.whereToStore = whereToStore;
    }

    public String getWhatToStore() {
        return whatToStore;
    }

    public String getWhereToStore() {
        return whereToStore;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        setIsTaskExecuted(true);
        System.out.println("Execute task: " + getTaskName() + "\n[ Store the " + getWhatToStore() + " in the " + getWhereToStore() + " ]");
    }

    public void setIsTaskExecuted(boolean executedTask) {
        this.executedTask = executedTask;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
