package prototype_tasks;

import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString(){
        // given
        // creating the TaskList for "to do"
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1, n -> n +1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number" + n)));

    // creating the TaskList for tasks in progress
        TaskList listInProgress = new TaskList("In Progress Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task" + n)));

    // creating the TaskList for done tasks
        TaskList listDone = new TaskList("Done Tasks");
        IntStream.iterate(1, n -> n +1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Task" + n)));
    }


}
