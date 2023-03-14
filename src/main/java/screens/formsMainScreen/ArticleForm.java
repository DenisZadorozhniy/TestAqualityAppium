package screens.formsMainScreen;

import static aquality.appium.mobile.application.AqualityServices.getElementFactory;
import static utils.SwipeUtils.makeSwipe;

import org.openqa.selenium.By;

import java.util.List;

import aquality.appium.mobile.actions.SwipeDirection;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.elements.interfaces.ITextBox;

public class ArticleForm {
    private final ITextBox titleArticle;
    private final ITextBox fundingPercentageArticle;
    private final ITextBox backersArticle;
    private final ITextBox daysToGoArticle;

    public ArticleForm(String position) {

        String articlePosition = String.format("android.widget.RelativeLayout[%s]", position);
        ILabel baseLocator = getElementFactory().getLabel(By.xpath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/" +
                "android.widget.RelativeLayout/android.widget.ScrollView/androidx.viewpager.widget." +
                "ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget" +
                ".RecyclerView/" + articlePosition), "base locator2");

        this.titleArticle = baseLocator.findChildElement(By.id("com.kickstarter.kickstarter:id/name_and_blurb_text_view"), ITextBox.class);
        this.fundingPercentageArticle = baseLocator.findChildElement(By.id("com.kickstarter.kickstarter:id/percent"), ITextBox.class);
        this.backersArticle = baseLocator.findChildElement(By.id("com.kickstarter.kickstarter:id/backers_count"), ITextBox.class);
        this.daysToGoArticle = baseLocator.findChildElement(By.id("com.kickstarter.kickstarter:id/deadline_countdown"), ITextBox.class);
        makeSwipe(titleArticle, SwipeDirection.DOWN);
    }

    public String getTitle() {
        return titleArticle.getText();
    }

    public String getFundingPercentage() {
        return fundingPercentageArticle.getText();
    }

    public String getBackersArticle() {
        return backersArticle.getText();
    }

    public String getDaysToGoArticle() {
        return daysToGoArticle.getText();
    }
}
