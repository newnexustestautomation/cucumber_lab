package nl.newnexus.lab.framework;

/**
 * Created by robertvanbuiten on 01-09-16.
 */

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

        import java.util.List;

public abstract class DSL {

    protected WebDriver driver;
    protected WebElement activeElement;


    @FindBy(className = "btn btn-default")
    protected List<WebElement> buttons;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public boolean click(String text) {
        if (findElement(By.linkText(text))) {
            activeElement.click();
            return true;
        } else {
            return false;
        }

    }

    private boolean findElement(By by) {
        activeElement = driver.findElement(by);
        if (activeElement.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTextOnPagePresent(String text) {
        WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText().toLowerCase();
        return bodyText.contains(text.toLowerCase());
    }

    public Boolean clickOnButton(String text)
    {


        buttons = driver.findElements(By.className("btn"));

        if (buttons.size() == 1)
        {
            buttons.get(0).click();
            return true;
        } else {
            for (WebElement e : buttons) {

                if (e.isDisplayed() && e.isEnabled()) {

                    if (e.getText().equalsIgnoreCase(text)) {
                        e.click();
                        return true;
                    }
                }
            }
        }
        return false;
    }



    public boolean click(By by) {
       if (findElement(by)) {
           activeElement.click();
           return true;
       } else {
           return false;
       }
    }

    public boolean hasElement(By by) {
        return !driver.findElements(by).isEmpty();
    }

}
