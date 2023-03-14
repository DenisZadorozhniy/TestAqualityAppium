package screens.formsMainScreen;

import static aquality.appium.mobile.application.AqualityServices.getElementFactory;

import org.openqa.selenium.By;

import aquality.appium.mobile.elements.interfaces.IButton;

public class EndingSoonTabForm {

    private final IButton endingSoonBtn = getElementFactory().getButton(By.xpath("//android.widget.LinearLayout" +
            "[@content-desc=\"Ending Soon\"]/android.widget.TextView"), "Ending soon button");

    public Boolean getEndingSoonBtnAttributeSelected() {
        return Boolean.valueOf(endingSoonBtn.getAttribute("selected"));
    }
}
