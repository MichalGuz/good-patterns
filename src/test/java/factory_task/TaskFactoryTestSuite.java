package factory_task;

import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testOfShoppingTask() {
        // given
        TaskFactory taskFactory = new TaskFactory();

        // when
        Task shoppingTask = taskFactory.processTask(TaskFactory.SHOPPING_TASK);
        }
    }
}
