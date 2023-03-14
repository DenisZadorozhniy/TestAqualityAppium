package screens.formsMainScreen;

import static aquality.appium.mobile.application.AqualityServices.getElementFactory;

import org.openqa.selenium.By;

import aquality.appium.mobile.elements.interfaces.IButton;

public class MagicTabForm {

    private final IButton magicBtn;

    public MagicTabForm() {
        magicBtn = getElementFactory().getButton(By.xpath("//android.widget.LinearLayout" +
                "[@content-desc=\"Magic\"]/android.widget.TextView"), "Magic button");
    }

    public Boolean getMagicBtnBtnAttributeSelected() {
        return Boolean.valueOf(magicBtn.getAttribute("selected"));
    }
}
