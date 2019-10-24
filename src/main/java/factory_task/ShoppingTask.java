package factory_task;

public class ShoppingTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean executedTask;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute task: " + getTaskName() + ";\n[ buy " + getQuantity() + " pieces of " + getWhatToBuy() + " ]" );
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public void setIsTaskExecuted(boolean executedTask) {
        this.executedTask = executedTask;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
