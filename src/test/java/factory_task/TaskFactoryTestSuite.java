package factory_task;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testOfShoppingTask() {
        // given
        TaskFactory taskFactory = new TaskFactory();

        // when
        Task shoppingTask = taskFactory.processTask(TaskFactory.SHOPPING_TASK);

        // then
        shoppingTask.executeTask();
        Assert.assertEquals("Easter task #1", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testOfPaintingTask() {
        // given
        TaskFactory taskFactory = new TaskFactory();

        // when
        Task paintingTask = taskFactory.processTask(TaskFactory.PAINTING_TASK);

        // then
        paintingTask.executeTask();
        Assert.assertEquals("Easter task #2", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testOfStoringTask() {
        // given
        TaskFactory taskFactory = new TaskFactory();

        // when
        Task storingTask = taskFactory.processTask(TaskFactory.STORING_TASK);

        // then
        storingTask.executeTask();
        Assert.assertEquals("Easter task #3", storingTask.getTaskName());
        Assert.assertEquals(true, storingTask.isTaskExecuted());
    }
}
