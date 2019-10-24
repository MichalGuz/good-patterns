package factory_task;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToColor;

    public PaintingTask(String taskName, String color, String whatToColor) {
        this.taskName = taskName;
        this.color = color;
        this.whatToColor = whatToColor;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToColor() {
        return whatToColor;
    }
}
