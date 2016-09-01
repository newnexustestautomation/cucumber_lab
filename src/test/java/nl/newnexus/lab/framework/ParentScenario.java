package nl.newnexus.lab.framework;

/**
 * Created by robertvanbuiten on 01-09-16.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class ParentScenario {

    private WebDriver driver;


    protected void startBrowser() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    protected void navigateTo() {
        driver.navigate().to("http://docs.seleniumhq.org/");
    }

    protected void closeBrowser() {
        driver.quit();
    }
}
