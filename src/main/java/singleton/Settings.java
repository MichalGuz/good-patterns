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
}
