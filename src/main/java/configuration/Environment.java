package configuration;

import aquality.appium.mobile.application.AqualityServices;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;

import java.nio.file.Path;
import java.nio.file.Paths;

class Environment {

    private Environment() {
    }

    static ISettingsFile getCurrentData() {
        String envName = (String) AqualityServices.get(ISettingsFile.class).getValue("/data");
        Path resourcePath = Paths.get( envName, "data.json");
        return new JsonSettingsFile(resourcePath.toString());
    }
}
