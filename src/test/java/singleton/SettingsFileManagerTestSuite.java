package singleton;

import org.junit.AfterClass;
import org.junit.Assert;
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
        String fileName = settingsFileManager.getFileName();
        System.out.println("Opened:" + fileName);

        // then
        Assert.assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        // given
        // when
        boolean result = settingsFileManager.load();

        // then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        // given
        // when
        boolean result = settingsFileManager.saveSettings();
    }
}
