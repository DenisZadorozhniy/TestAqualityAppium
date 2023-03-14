package screens;

import static utils.LoadFromProperties.getProperties;

import org.openqa.selenium.By;
import aquality.appium.mobile.screens.Screen;
import screens.formsMainScreen.ArticleForm;
import screens.formsMainScreen.EndingSoonTabForm;
import screens.formsMainScreen.HeaderForm;
import screens.formsMainScreen.MagicTabForm;
import screens.formsMainScreen.NewestTabForm;
import screens.formsMainScreen.PopularTabForm;


public class MainScreen extends Screen {

    public MainScreen() {
        super(By.id("com.kickstarter.kickstarter:id/action_bar_root"), "Main Screen");
    }

    public HeaderForm getHeaderForm() {
        return new HeaderForm();
    }

    public ArticleForm getArticleForm() {
        return new ArticleForm(getProperties("articlePosition"));
    }

    public MagicTabForm getMagicForm() {
        return new MagicTabForm();
    }

    public PopularTabForm getPopularForm() {
        return new PopularTabForm();
    }

    public NewestTabForm getNewestForm() {
        return new NewestTabForm();
    }

    public EndingSoonTabForm getEndingSoonForm() {
        return new EndingSoonTabForm();
    }

}
