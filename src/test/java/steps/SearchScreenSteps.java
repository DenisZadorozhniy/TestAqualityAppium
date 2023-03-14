package steps;

import static java.lang.String.format;

import org.junit.jupiter.api.Assertions;
import models.Article;
import screens.SearchScreen;

public class SearchScreenSteps {

    private final SearchScreen searchScreen;

    public SearchScreenSteps() {
        this.searchScreen = new SearchScreen();
    }

    public void writeTextToSearch(Article article) {
        searchScreen.sendKeysForSearch(article.getTitle());
    }

    public void checkArticleFunding(Article article) {
        String fundingPercentage = searchScreen.getArticleForm().getFundingPercentage();
        String articleFundingPercentage = article.getFundingPercentage();
        Assertions.assertEquals(fundingPercentage, articleFundingPercentage,
                format("The funding percentage value must be equal to '%s'", articleFundingPercentage));
    }

    public void checkDaysToGoArticle(Article article) {
        String daysToGo = searchScreen.getArticleForm().getDaysToGoArticle();
        String articleDaysToGo = article.getDaysToGo();
        Assertions.assertEquals(daysToGo, articleDaysToGo,
                format("The days to go value must be equal to '%s'", articleDaysToGo));
    }

    public void clickOnSearchArticle() {
        searchScreen.getArticleForm().clickOnArticle();
    }
}
