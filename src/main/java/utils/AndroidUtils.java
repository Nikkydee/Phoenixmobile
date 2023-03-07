package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

import java.net.MalformedURLException;
import java.net.URL;

import static com.sun.webkit.network.URLs.newURL;

public class AndroidUtils {

// you donot declare a variable inside constructor
        DesiredCapabilities caps;
         URL remoteURL;
         AppiumDriver<AndroidElement> ad;

    public AndroidUtils() throws MalformedURLException {
             caps = new DesiredCapabilities();
             caps.setCapability("platformName","Android");
             caps.setCapability("app", System.getProperty("user.dir")+"//apk//fst-v1.apk");
             try {
                 remoteURL = newURL("http://localhost:4723/wd/hub");
             }catch(MalformedURLException e){
                 e.printStackTrace();
             }

        launchApp();
    }

    public AppiumDriver<AndroidElement> getAd() {
        return ad;
    }

    public AndroidUtils(AppiumDriver<AndroidElement> ad) {
        this.ad = ad;
    }

    public AppiumDriver<AndroidElement> launchApp(){
        ad = new AppiumDriver<>(remoteURL,caps);//launchapp
        return ad;

    }

    public void enterText(By locator, String value){
        AndroidElement element = (AndroidElement) ad.findElement(locator);
        element.sendKeys(value);
    }
    public void clickOn(By locator){
        AndroidElement element = (AndroidElement) ad.findElement(locator);
        element.click();
    }
    public static void sleepFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }



