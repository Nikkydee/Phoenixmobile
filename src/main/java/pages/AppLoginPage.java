package pages;

import org.openqa.selenium.By;
import utils.AndroidUtils;

import java.net.MalformedURLException;

public class AppLoginPage extends AndroidUtils {

    private static final By USERNAME_TEXTBOX_LOCATOR = By.id("editTextUsername");
    private static final By PASSWORD_TEXTBOX_LOCATOR = By.id("editTextPassword");
    private static final By LOGIN_BUTTON_LOCATOR = By.id("submitButton");

    public AppLoginPage() throws MalformedURLException {
    }

    public AppDashboardPage doLogin(String userName , String password)  {
        sleepFor((10));
        enterText(USERNAME_TEXTBOX_LOCATOR, "iamfd");
        enterText(PASSWORD_TEXTBOX_LOCATOR, "password");
        clickOn(LOGIN_BUTTON_LOCATOR);
        return new AppDashboardPage(getAd());

    }


}
