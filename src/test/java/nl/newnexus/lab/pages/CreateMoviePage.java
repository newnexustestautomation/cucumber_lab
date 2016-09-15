package nl.newnexus.lab.pages;

import nl.newnexus.lab.framework.ParentPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by robertvanbuiten on 01-09-16.
 */
public class CreateMoviePage extends ParentPage {

    protected static Logger log = LogManager.getLogger(StartPage.class);

    @FindBy(xpath = "/html/body/div[2]/form/div[1]/ul/li/")
    private WebElement foutmelding;

    @FindBy(id = "Title")
    private WebElement title;

    @FindBy(id = "Director")
    private WebElement director;

    @FindBy(id = "DateReleased")
    private WebElement datereleased;

    public CreateMoviePage(WebDriver driver)
    {
        super(driver);

    }

    public boolean maakEenfilm(String stitel, String sdirector, String sdate)
    {
        PageFactory.initElements(driver,this);
        if (title.isDisplayed())
            title.sendKeys(stitel);
        if (director.isDisplayed())
            director.sendKeys(sdirector);
        if (datereleased.isDisplayed())
            datereleased.sendKeys(sdate);

        clickOnButton("Create");
        return true;
    }

    public boolean checkFoutmelding(String text)
    {
        PageFactory.initElements(driver,this);
         return isTextOnPagePresent(text.toLowerCase());
    }

    public boolean wordtPaginaGetoond()
    {
        return isTextOnPagePresent("Movie");
    }


}
