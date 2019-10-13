package sigleton_logger;

public class Logger {
    private String lastLog = "";

    public void log(String log){
        lastLog = log;
        System.out.println("Log [ " + log + "]");
    }
}
