package sigleton_logger;

public class Logger {
    private static Logger logger = null;
    private String lastLog = "";

    private Logger(){};

    public void log(String log){
        lastLog = log;
        System.out.println("Log [ " + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
