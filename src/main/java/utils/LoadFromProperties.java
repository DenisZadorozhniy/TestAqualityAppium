package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import aquality.selenium.core.logging.Logger;

public class LoadFromProperties {
    public static String getProperties(String property) {
        String path = "src/main/resources/environment/data.properties";
        Properties properties = new Properties();

        try (FileInputStream fileProperties = new FileInputStream(path)) {
            properties = new Properties();
            properties.load(fileProperties);
        } catch (IOException e) {
            Logger.getInstance().error(e.getMessage());
        }
        return properties.getProperty(property);
    }
}
