package singleton;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileManagerTestSuite {
    private static SettingsFileManager settingsFileManager;

    @BeforeClass
    public static void openSettingsFIle() {
        settingsFileManager = new SettingsFileManager();
        settingsFileManager.open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        settingsFileManager.close();
    }

    @Test
    public void testGetFileName() {
        // when
        String finleName = settingsFileManager.getFileName();
        System.out.println("Opened:" + fileName);
    }
}
