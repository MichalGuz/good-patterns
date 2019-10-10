package singleton;

public final class Settings {
    private String fileName = "";

    public Settings() {
    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
       this.fileName = fileName;
        System.out.println("Opening the settings file.");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the seetings file.");
    }

    public boolean load() {
        System.out.println("Loading settings from file.");
        return true;
    }

    boolean saveSettings() {
        System.out.println("Saving settings to file.");
        return true;
    }
}
