package sigleton_logger;

import sun.rmi.runtime.Log;

public class Logger {
    private static Logger logger = null;
    private String lastLog = "";

    private Logger(){};

    public void log(String log){
        lastLog = log;
        System.out.println("Log [ " + log + "]");
    }

    public static Logger getInstance(){}

    public String getLastLog() {
        return lastLog;
    }
}
