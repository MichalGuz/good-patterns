package sigleton_logger;

import org.junit.Assert;
import org.junit.Test;

public class SingletonLoggerTestSuite {
    private static Logger logger;
    @Test
    public void testGetLastLogger(){
        // given
        String log = "2019.10.13 18:38 main_user";

        // when
        Logger.getInstance().log(log);
        String lastLog = logger.getLastLog();

        // then
        Assert.assertEquals(lastLog, log);
    }
}
