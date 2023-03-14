package screens;

import org.openqa.selenium.By;

import aquality.appium.mobile.elements.interfaces.ITextBox;
import aquality.appium.mobile.screens.Screen;

public class ArticleScreen extends Screen {

    private final ITextBox daysToGo;

    public ArticleScreen() {
        super(By.id("com.kickstarter.kickstarter:id/action_bar_root"), "Article screen");
        this.daysToGo = getElementFactory().getTextBox(By.id("com.kickstarter.kickstarter:id/deadline_countdown_text_view"),
               "Days to go");
    }

    public String getDaysToGo(){
        return daysToGo.getText();
    }
}
