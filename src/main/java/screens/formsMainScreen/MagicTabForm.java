package screens.formsMainScreen;

import org.openqa.selenium.By;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.screens.Screen;

public class MagicTabForm extends Screen {

    private final IButton magicBtn;

    public MagicTabForm() {
        super(By.id("com.kickstarter.kickstarter:id/discovery_recycler_view"), "MagicTab Form");
        magicBtn = getElementFactory().getButton(By.xpath("//android.widget.LinearLayout" +
                "[@content-desc=\"Magic\"]/android.widget.TextView"), "Magic button");
    }

    public Boolean getMagicBtnBtnAttributeSelected() {
        return Boolean.valueOf(magicBtn.getAttribute("selected"));
    }
}
