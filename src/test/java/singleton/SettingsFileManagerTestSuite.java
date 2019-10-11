package singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileManagerTestSuite {
    private static SettingsFileManager settingsFileManager;

    @BeforeClass
    public static void openSettingsFIle() {
        SettingsFileManager.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        SettingsFileManager.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        // when
        String fileName = SettingsFileManager.getInstance().getFileName();
        System.out.println("Opened:" + fileName);

        // then
        Assert.assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        // given
        // when
        boolean result = SettingsFileManager.getInstance().load();

        // then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        // given
        // when
        boolean result = SettingsFileManager.getInstance().saveSettings();

        // then
        Assert.assertTrue(result);
    }
}
