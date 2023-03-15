package screens.formsSearchScreen;


import org.openqa.selenium.By;

import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import aquality.appium.mobile.screens.Screen;

public class SearchArticleForm extends Screen {

    private final ITextBox titleArticle;
    private final ITextBox fundingPercentageArticle;
    private final ITextBox daysToGoArticle;

    public SearchArticleForm() {

        super(By.id("com.kickstarter.kickstarter:id/featured_search_result_view"), "NewestTabForm Form");
        ILabel baseLocator = getElementFactory().getLabel(By.id("com.kickstarter.kickstarter:id/featured_search_result_view"),
                "Base locator for SearchArticleForm ");
        this.titleArticle = baseLocator.findChildElement(By.id("com.kickstarter.kickstarter:id/project_name_text_view"),
                ITextBox.class);
        this.fundingPercentageArticle = baseLocator.findChildElement(By.id("com.kickstarter.kickstarter:id/" +
                        "search_result_percent_funded_text_view"),ITextBox.class);
        this.daysToGoArticle = baseLocator.findChildElement(By.id("com.kickstarter.kickstarter:id/search_result" +
                "_deadline_countdown_text_view"),ITextBox.class);
    }

    public String getTitle(){
        return titleArticle.getText();
    }

    public String getFundingPercentage(){
        return fundingPercentageArticle.getText();
    }

    public String getDaysToGoArticle() {
        return daysToGoArticle.getText();
    }

    public void clickOnArticle(){
        titleArticle.click();
    }
}
