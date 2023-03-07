package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import utils.AndroidUtils;

public class AppDashboardPage extends AndroidUtils {

    private static final By SEARCH_TEXTBOX_LOCATOR = By.id("editTextSearch");
    private static final By DASHBOARD_TAB_LOCATOR = By.id("dashboard");
    private static final By IN_OUT_TAB_LOCATOR = By.id("inOutTabs");
    private static final By PROFILE_TAB_LOCATOR = By.id("profile");

    public AppDashboardPage(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }

    public void searchJob(String jobNumber) {
        sleepFor(10);
        enterText(SEARCH_TEXTBOX_LOCATOR, jobNumber);

    }

    public void goToInOutTab() {
            sleepFor(10);
            clickOn(IN_OUT_TAB_LOCATOR);

        }
        public void goToProfileTab() {
            sleepFor(10);
            clickOn(PROFILE_TAB_LOCATOR);

        }

    }






