package steps;

import static java.lang.String.format;

import org.junit.jupiter.api.Assertions;

import models.Article;
import screens.ArticleScreen;

public class ArticleScreenSteps {
    private final ArticleScreen articleScreen;

    public ArticleScreenSteps() {
        this.articleScreen = new ArticleScreen();
    }

    public void compareDaysToGoValues(Article article){
        String daysToGo = articleScreen.getDaysToGo();
        String articleDaysToGo = article.getDaysToGo();
        Assertions.assertEquals(daysToGo, articleDaysToGo,
                format("The days to go value must be equal to '%s'", articleDaysToGo));
    }
}
