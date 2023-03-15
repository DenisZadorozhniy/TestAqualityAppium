package screens.formsMainScreen;


import org.openqa.selenium.By;
import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.screens.Screen;

public class PopularTabForm extends Screen {

    private final IButton popularBtn;

    public PopularTabForm() {
        super(By.id("com.kickstarter.kickstarter:id/discovery_view_pager"), "EndingSoonTab Form");
        popularBtn = getElementFactory().getButton(By.xpath("//android.widget.LinearLayout" +
                "[@content-desc=\"Popular\"]"), "Popular button");
    }

    public Boolean getPopularBtnAttributeSelected() {
        return Boolean.valueOf(popularBtn.getAttribute("selected"));
    }
}
