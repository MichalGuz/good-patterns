package factory_task;

public class StoringTask {
    private String taskName;
    private String whatToStore;
    private String whereToStore;

    public StoringTask(String taskName, String whatToStore, String whereToStore) {
        this.taskName = taskName;
        this.whatToStore = whatToStore;
        this.whereToStore = whereToStore;
    }
}
