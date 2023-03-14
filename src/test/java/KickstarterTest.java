import org.junit.jupiter.api.Test;

import aquality.appium.mobile.actions.SwipeDirection;
import models.Article;
import screens.enums.ButtonMenuName;
import steps.ArticleScreenSteps;
import steps.MainScreenSteps;
import steps.SearchScreenSteps;

public class KickstarterTest extends BaseTest {
    private final MainScreenSteps mainScreenSteps;
    private final SearchScreenSteps searchScreenSteps;
    private final ArticleScreenSteps articleScreenSteps;

    public KickstarterTest() {
        this.mainScreenSteps = new MainScreenSteps();
        this.searchScreenSteps = new SearchScreenSteps();
        this.articleScreenSteps = new ArticleScreenSteps();
    }

    @Test
    public void firstTest() {
        mainScreenSteps.swipeToPopular(SwipeDirection.RIGHT);
        mainScreenSteps.isMenuButtonSelected(ButtonMenuName.POPULAR);
        Article article = mainScreenSteps.getArticle();

        mainScreenSteps.clickSearchButton();
        searchScreenSteps.writeTextToSearch(article);
        searchScreenSteps.checkArticleFunding(article);
        searchScreenSteps.checkDaysToGoArticle(article);

        searchScreenSteps.clickOnSearchArticle();
        articleScreenSteps.compareDaysToGoValues(article);
    }
}
