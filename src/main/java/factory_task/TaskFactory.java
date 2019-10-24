package factory_task;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING";
    public static final String PAINTING_TASK = "PAINTING";
    public static final String STORING_TASK = "STORING";

    public final Task processTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Easter task #1", "eggs", 10);
            case PAINTING_TASK:
                return new PaintingTask("Easter task #2", "red", "boiled eggs");
            case STORING_TASK:
                return new StoringTask("Easter task #3", "coloured eggs", "fridge");
            default:
                return null;
        }
    }
}
