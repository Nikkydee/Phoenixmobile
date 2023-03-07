package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AppDashboardPage;
import pages.AppLoginPage;
import utils.AndroidUtils;

import java.net.MalformedURLException;
import java.net.URL;

import static com.sun.webkit.network.URLs.newURL;
import static jdk.nashorn.internal.runtime.Debug.id;

public class LoginScript {

    public static void main(String[] args)throws MalformedURLException {
        AppLoginPage loginpage = new AppLoginPage();
        AppDashboardPage dashboardPage = loginpage.doLogin("iamfd","password");
        dashboardPage.searchJob("JOB_22628");
        dashboardPage.goToInOutTab();
        dashboardPage.goToProfileTab();

        }

    }




