package screens.formsMainScreen;

import org.openqa.selenium.By;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.screens.Screen;

public class EndingSoonTabForm extends Screen {

    private final IButton endingSoonBtn;

    public EndingSoonTabForm() {
        super(By.id("com.kickstarter.kickstarter:id/discovery_view_pager"), "EndingSoonTab Form");
        this.endingSoonBtn = getElementFactory().getButton(By.xpath("//android.widget.LinearLayout" +
                "[@content-desc=\"Ending Soon\"]/android.widget.TextView"), "Ending soon button");
    }

    public Boolean getEndingSoonBtnAttributeSelected() {
        return Boolean.valueOf(endingSoonBtn.getAttribute("selected"));
    }
}
