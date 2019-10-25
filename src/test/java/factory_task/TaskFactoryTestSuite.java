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

        // then
        Assert.assertEquals("Easter task #1", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
     }

    @Test
    public void testOfPaintingTask() {
        // given
        TaskFactory taskFactory = new TaskFactory();
        ExecutedTaskCounter e = new ExecutedTaskCounter();

        // when
        Task paintingTask = taskFactory.processTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();

        // then
        Assert.assertEquals("Easter task #2", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
      }

    @Test
    public void testOfStoringTask() {
        // given
        TaskFactory taskFactory = new TaskFactory();
        ExecutedTaskCounter e = new ExecutedTaskCounter();

        // when
        Task storingTask = taskFactory.processTask(TaskFactory.STORING_TASK);
        storingTask.executeTask();

        // then
        Assert.assertEquals("Easter task #3", storingTask.getTaskName());
        Assert.assertEquals(true, storingTask.isTaskExecuted());
    }
}
