package singleton;

public class SettingsFileManagerTestSuite {
    private static SettingsFileManager settingsFileManager;

    public static void openSettingsFIle() {
        settingsFileManager = new SettingsFileManager();
        settingsFileManager.open("myapp.settings");
    }
}
