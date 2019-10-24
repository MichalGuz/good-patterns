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

    }
}
