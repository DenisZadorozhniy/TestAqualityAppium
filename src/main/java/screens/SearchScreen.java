package screens;

import org.openqa.selenium.By;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.screens.Screen;
import screens.formsSearchScreen.SearchArticleForm;

public class SearchScreen extends Screen {

    private final ILabel searchInput;

    public SearchScreen() {
        super(By.id("com.kickstarter.kickstarter:id/search_layout"), "Search screen");
        this.searchInput = getElementFactory().getLabel(By.id("com.kickstarter.kickstarter:id/search_edit_text"),
                "Search Input");
    }

    public SearchArticleForm getArticleForm() {
        return new SearchArticleForm();
    }

    public void sendKeysForSearch(String text) {
        searchInput.sendKeys(text);
    }
}
