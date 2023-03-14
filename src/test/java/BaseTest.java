import org.junit.jupiter.api.AfterAll;
import aquality.appium.mobile.application.AqualityServices;

public class BaseTest {

    @AfterAll
    public static void afterAll(){
        AqualityServices.getApplication().getDriver().quit();
    }
}
