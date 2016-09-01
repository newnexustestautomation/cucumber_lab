package nl.newnexus.lab.pages;

import nl.newnexus.lab.framework.ParentPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by robertvanbuiten on 01-09-16.
 */
public class CreateAccountPage extends ParentPage {

    protected static Logger log = LogManager.getLogger(StartPage.class);

    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(id = "Password")
    private WebElement password;

    @FindBy(id = "ConfirmPassword")
    private WebElement confirmpassword;

    public CreateAccountPage(WebDriver driver)
    {
        super(driver);

    }

    public boolean maakEenAccount(String stremail, String strpassword)
    {
        PageFactory.initElements(driver,this);
        if (password.isDisplayed())
            password.sendKeys(strpassword);
        if (email.isDisplayed())
            email.sendKeys(stremail);
        if (confirmpassword.isDisplayed())
            confirmpassword.sendKeys(strpassword);

        clickOnButton("Register");
        return true;
    }

    public boolean wordtPaginaGetoond()
    {
        return isTextOnPagePresent("create a new account");
    }


}
