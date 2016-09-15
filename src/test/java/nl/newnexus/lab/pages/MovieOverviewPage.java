package nl.newnexus.lab.pages;

import nl.newnexus.lab.framework.ParentPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;
import java.util.List;

/**
 * Created by robertvanbuiten on 15-09-16.
 */
public class MovieOverviewPage extends ParentPage {

    protected static Logger log = LogManager.getLogger(StartPage.class);

    @FindBy(className= "table")
    private WebElement overview;

    @FindBy(xpath = "//a[@href='/Home/Create']")
    private WebElement createnew;

    public MovieOverviewPage(WebDriver driver)  {

        super(driver);
    }

    public boolean clickCreateNew()
    {
        PageFactory.initElements(driver,this);
        if (createnew.isDisplayed()) {
            createnew.click();
            return true;
        }
        return false;
    }

    public boolean controleerFilm(String titel, String regiseur, Date released) {

        boolean blnResult;
        PageFactory.initElements(driver,this);

        List<WebElement> rows = overview.findElements(By.tagName("tr"));
        for(WebElement row : rows)
        {
            String strRow = row.getText().toLowerCase();

            if (strRow.contains(titel.toLowerCase()) && strRow.contains(regiseur.toLowerCase()))
                return true;

            /*
            List<WebElement> columns = row.findElements(By.tagName("th"));
            if (!columns.get(0).getText().equalsIgnoreCase(titel)) {
                log.error("Titel komt niet overeen " + titel);
                blnResult = false;
            }
            if (!columns.get(1).getText().equalsIgnoreCase(regiseur))
            {
                log.error("Regiseur komt niet overeen " + regiseur);
                blnResult = false;
            }
            if (blnResult)
                return true;
                */
        }

        return false;
    }



}
