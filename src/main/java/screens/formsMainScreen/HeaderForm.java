package screens.formsMainScreen;

import org.openqa.selenium.By;

import aquality.appium.mobile.actions.SwipeDirection;
import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.screens.Screen;

public class HeaderForm extends Screen {

   private final IButton searchButton;

    public HeaderForm() {
        super(By.id("com.kickstarter.kickstarter:id/discovery_sort_app_bar_layout"), "Header Form");
        this.searchButton = getElementFactory().getButton(By.id("com.kickstarter.kickstarter:id/search_button"),"Search");
    }

    public void clickSearchButton(){
        searchButton.getTouchActions().scrollToElement(SwipeDirection.UP);
        searchButton.click();
    }

}
