package factory_task;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToColor;
    private boolean executedTask;

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

    @Override
    public void executeTask() {
        System.out.println("Execute task: " + getTaskName() +"\n[ " + "paint the " + getWhatToColor() + " with a color " + getColor() + " ]");
    }

    public void setIsTaskExecuted(boolean executedTask) {
        this.executedTask = executedTask;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
