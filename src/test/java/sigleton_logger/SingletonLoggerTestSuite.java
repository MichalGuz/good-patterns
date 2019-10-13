package sigleton_logger;

import org.junit.Assert;
import org.junit.Test;

public class SingletonLoggerTestSuite {
    @Test
    public void testGetLastLogger(){
        // given
        Logger logger = new Logger();
        String log = "2019.10.13 18:38 main_user";

        // when
        logger.log(log);
        String lastLog = logger.getLastLog();

        // then
        Assert.assertEquals(lastLog, log);
    }
}
