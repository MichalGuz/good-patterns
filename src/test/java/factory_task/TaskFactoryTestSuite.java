package factory_task;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testOfShoppingTask() {

        // given
        TaskFactory taskFactory = new TaskFactory();
        ExecutedTaskCounter e = new ExecutedTaskCounter();

        // when
        Task shoppingTask = taskFactory.processTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();
        boolean execution = shoppingTask.isTaskExecuted();
        e.addExecution(execution);

        // then
        Assert.assertEquals("Easter task #1", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals(1, e.getNumberOfExecutedTasks());
        System.out.println("The numbers of executed shopping task = " + e.getNumberOfExecutedTasks());
    }

    @Test
    public void testOfPaintingTask() {
        // given
        TaskFactory taskFactory = new TaskFactory();
        ExecutedTaskCounter e = new ExecutedTaskCounter();

        // when
        Task paintingTask = taskFactory.processTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();
        boolean execution = paintingTask.isTaskExecuted();
        e.addExecution(execution);

        // then
        Assert.assertEquals("Easter task #2", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals(1, e.getNumberOfExecutedTasks());
        System.out.println("The numbers of executed painting task = " + e.getNumberOfExecutedTasks());
      }

    @Test
    public void testOfStoringTask() {
        // given
        TaskFactory taskFactory = new TaskFactory();
        ExecutedTaskCounter e = new ExecutedTaskCounter();

        // when
        Task storingTask = taskFactory.processTask(TaskFactory.STORING_TASK);
        storingTask.executeTask();
        boolean execution = storingTask.isTaskExecuted();
        e.addExecution(execution);

        // then
        Assert.assertEquals("Easter task #3", storingTask.getTaskName());
        Assert.assertEquals(true, storingTask.isTaskExecuted());
        Assert.assertEquals(1, e.getNumberOfExecutedTasks());
    }
}
