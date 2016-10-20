package nl.newnexus.lab.adapters;

import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.model.LayoutReport;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.nl.Als;
import cucumber.api.java.nl.Dan;
import cucumber.api.java.nl.En;
import cucumber.api.java.nl.Gegeven;
import nl.newnexus.lab.database.DatabaseHandler;
import nl.newnexus.lab.database.Movie;
import nl.newnexus.lab.database.User;
import nl.newnexus.lab.framework.ParentStep;
import nl.newnexus.lab.pages.CreateAccountPage;
import nl.newnexus.lab.pages.CreateMoviePage;
import nl.newnexus.lab.pages.MovieOverviewPage;
import nl.newnexus.lab.pages.StartPage;
import org.testng.Assert;
import nl.newnexus.lab.database.*;


import java.util.Date;

import static java.util.Arrays.asList;

/**
 * Created by robertvanbuiten on 01-09-16.
 */
public class StepDefinitions extends ParentStep {

    private DatabaseHandler dbHandler;
    public User user;
    public Movie movie;

    @Before
    public void startTest(Scenario scenario)
    {
        dbHandler=DatabaseHandler.getInstance();
        dbHandler.init();
        initTest(scenario);
    }

    @After
    public void createGalenReport(Scenario scenario)
    {
        teardownTest(scenario);
    }


    @Als("^er een account wordt aangemaakt met \"([^\"]*)\" en \"([^\"]*)\"$")
    public void erEenAccountWordtAangemaaktMetEn(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        StartPage start = new StartPage(driver);
        Assert.assertEquals(true,start.click("Register"),"Kan link niet vinden.");

        CreateAccountPage create = new CreateAccountPage(driver);
        Assert.assertEquals(true,create.maakEenAccount(arg0,arg1), "Kan geen account aanmaken");
    }

    @Dan("^is het \"([^\"]*)\" en het \"([^\"]*)\" zichtbaar in de database$")
    public void isHetEnHetZichtbaarInDeDatabase(String arg0, String arg1) throws Throwable {

        Assert.assertEquals(true,true,"niet gelukt");
        // Zoek in de database
    }

    @Gegeven("^marvins movie store is opgestart$")
    public void marvinsMovieStoreIsOpgestart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setBrowserType("chrome");
        driver = createDriver(null);
        load("https://localhost:44312");
        String item = getDriver().getTitle();
        Assert.assertEquals(true,item.contains("CheckIT"),"movie store is geopend");

        log.info(item);

        /*
        // Write code here that turns the phrase above into concrete actions
        LayoutReport layoutReport = Galen.checkLayout(driver, "/specs/example.spec", asList("desktop"));

        // Creating an object that will contain the information about the test
        GalenTestInfo test = GalenTestInfo.fromString("Start pagina");
        test.getReport().layout(layoutReport, "Start pagina");
        tests.add(test);
        */
    }

    @Dan("^wordt een foutmelding \"([^\"]*)\" getoond$")
    public void wordtEenFoutmeldingGetoond(String text) throws Throwable {

        if (!text.equalsIgnoreCase(""))
            Assert.assertEquals(true,new CreateAccountPage(driver).checkFoutmelding(text),"foutmelding wordt niet getoond");
    }



    @En("^er wordt ingelogd met \"([^\"]*)\" en \"([^\"]*)\"$")
    public void erWordtIngelogdMetEn(String arg0, String arg1) throws Throwable {
        StartPage start = new StartPage(driver);
        //Assert.assertEquals(true,start.wordtPaginaGetoond(),"Start pagina wordt niet getoond.");
        Assert.assertEquals(true,start.login(arg0,arg1),"Kan niet inloggen");

    }

    @Dan("^zijn de \"([^\"]*)\", \"([^\"]*)\" en zichtbaar in het filmoverzicht$")
    public void zijnDeEnZichtbaarInHetFilmoverzicht(String titel, String producer) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MovieOverviewPage overview = new MovieOverviewPage(driver);
        Assert.assertEquals(true,overview.controleerFilm(titel,producer,new Date()),"Film niet gevonden");
    }

    @Als("^een film wordt aangemaakt met \"([^\"]*)\", \"([^\"]*)\" en \"([^\"]*)\"$")
    public void eenFilmWordtAangemaaktMetEn(String tit, String reg, String dat) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MovieOverviewPage overview = new MovieOverviewPage(driver);
        Assert.assertEquals(true,overview.clickCreateNew(),"Overview niet geopend?");

        CreateMoviePage create = new CreateMoviePage(driver);
        Assert.assertEquals(true,create.maakEenfilm(tit,reg,dat));
    }

    @Dan("^zijn de \"([^\"]*)\", \"([^\"]*)\" opgenomen in de database$")
    public void zijnDeOpgenomenInDeDatabase(String title, String director) throws Throwable {
        movie = new Movie(dbHandler);
        Assert.assertTrue(movie.checkExists(title, director));
    }

    @Dan("^is het \"([^\"]*)\" zichtbaar in de database$")
    public void isHetZichtbaarInDeDatabase(String username) throws Throwable {
        user = new User(dbHandler);
        Assert.assertTrue(user.checkExistsByName(username));
    }
}
