package screens.formsMainScreen;

import static aquality.appium.mobile.application.AqualityServices.getElementFactory;
import org.openqa.selenium.By;

import aquality.appium.mobile.actions.SwipeDirection;
import aquality.appium.mobile.elements.interfaces.IButton;

public class HeaderForm {

   private final IButton searchButton;

    public HeaderForm() {
        this.searchButton = getElementFactory().getButton(By.id("com.kickstarter.kickstarter:id/search_button"),"Search");
    }

    public void clickSearchButton(){
        searchButton.getTouchActions().scrollToElement(SwipeDirection.UP);
        searchButton.click();
    }


}
