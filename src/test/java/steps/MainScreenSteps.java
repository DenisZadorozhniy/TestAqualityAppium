package steps;

import static java.lang.String.format;

import static utils.StringUtils.extractTextBeforeDotOrColon;
import static utils.SwipeUtils.swipeWithDirection;

import org.junit.jupiter.api.Assertions;

import aquality.appium.mobile.actions.SwipeDirection;
import models.Article;
import screens.enums.ButtonMenuName;
import screens.MainScreen;

public class MainScreenSteps {

    private final MainScreen mainScreen;

    public MainScreenSteps() {
        this.mainScreen = new MainScreen();
    }

    public void swipeToPopular(SwipeDirection direction) {
        swipeWithDirection(direction);
    }

    public void isMenuButtonSelected(ButtonMenuName buttonMenuName) {
        String BUTTON_SHOULD_BE_SELECTED = "'%s' button should be selected.";
        String INVALID_BUTTON_NAME_MESSAGE = "Invalid button name - '%s'";
        switch (buttonMenuName) {
            case MAGIC:
                Assertions.assertTrue(mainScreen.getMagicForm().getMagicBtnBtnAttributeSelected(),
                        format(BUTTON_SHOULD_BE_SELECTED, buttonMenuName));
                break;
            case POPULAR:
                Assertions.assertTrue(mainScreen.getPopularForm().getPopularBtnAttributeSelected(),
                        format(BUTTON_SHOULD_BE_SELECTED, buttonMenuName));
                break;
            case NEWEST:
                Assertions.assertTrue(mainScreen.getNewestForm().getNewestBtnBtnAttributeSelected(),
                        format(BUTTON_SHOULD_BE_SELECTED, buttonMenuName));
                break;
            case ENDING_SOON:
                Assertions.assertTrue(mainScreen.getEndingSoonForm().getEndingSoonBtnAttributeSelected(),
                        format(BUTTON_SHOULD_BE_SELECTED, buttonMenuName));
                break;
            default:
                throw new IllegalArgumentException(format(INVALID_BUTTON_NAME_MESSAGE, buttonMenuName));
        }
    }

    public Article getArticle() {
        String title = extractTextBeforeDotOrColon(mainScreen.getArticleForm().getTitle());
        String fundingPercentage = mainScreen.getArticleForm().getFundingPercentage();
        String backersArticle = mainScreen.getArticleForm().getBackersArticle();
        String daysToGoArticle = mainScreen.getArticleForm().getDaysToGoArticle();
        return new Article(title, fundingPercentage, backersArticle, daysToGoArticle);
    }

    public void clickSearchButton() {
        mainScreen.getHeaderForm().clickSearchButton();
    }
}
