package factory_task;

public class StoringTask implements Task  {
    private String taskName;
    private String whatToStore;
    private String whereToStore;

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
}
