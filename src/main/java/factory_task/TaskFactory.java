package factory_task;

public class TaskFactory {
    private static final String SHOPPING_TASK = "SHOPPING";
    private static final String PAINTING_TASK = "PAITING";
    private static final String STORING_TASK = "STORING";

    public final Task processTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Easter task #1", "eggs", 10);

        }
    }

}
