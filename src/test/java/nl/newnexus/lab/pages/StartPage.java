package nl.newnexus.lab.pages;

import nl.newnexus.lab.framework.ParentPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by buiten.r on 06-07-2016.
 */
public class StartPage extends ParentPage {

    protected static Logger log = LogManager.getLogger(StartPage.class);


    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(id = "Password")
    private WebElement password;

    public StartPage(WebDriver driver)
    {
        super(driver);

    }

    public boolean controleerPagina()
    {
        PageFactory.initElements(driver, this);
        return true;
    }



    public boolean wordtPaginaGetoond() {
        return isTextOnPagePresent("create a new account");
    }


}
