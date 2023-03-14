package screens.formsMainScreen;

import static aquality.appium.mobile.application.AqualityServices.getElementFactory;

import org.openqa.selenium.By;
import aquality.appium.mobile.elements.interfaces.IButton;

public class PopularTabForm {

    private final IButton popularBtn;

    public PopularTabForm() {
        popularBtn = getElementFactory().getButton(By.xpath("//android.widget.LinearLayout" +
                "[@content-desc=\"Popular\"]"), "Popular button");
    }

    public Boolean getPopularBtnAttributeSelected() {
        return Boolean.valueOf(popularBtn.getAttribute("selected"));
    }
}
