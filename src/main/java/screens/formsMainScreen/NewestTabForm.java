package screens.formsMainScreen;

import org.openqa.selenium.By;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.screens.Screen;
import screens.MainScreen;

public class NewestTabForm extends Screen {

    private final IButton newestBtn;

    public NewestTabForm() {
        super(By.id("com.kickstarter.kickstarter:id/discovery_view_pager"), "NewestTabForm Form");
        newestBtn = getElementFactory().getButton(By.xpath("//android.widget.LinearLayout" +
                "[@content-desc=\"Newest\"]/android.widget.TextView"), "Newest button");
    }

    public Boolean getNewestBtnBtnAttributeSelected(){
        return Boolean.valueOf(newestBtn.getAttribute("selected"));
    }
}
