package nl.newnexus.lab.runners;

/**
 * Created by Marvin J on 7-9-2016.
 */


        import nl.newnexus.lab.database.DatabaseHandler;
        import nl.newnexus.lab.database.User;
        import nl.newnexus.lab.database.Movie;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.testng.annotations.AfterSuite;
        import org.testng.annotations.BeforeSuite;
        import org.testng.annotations.Test;

public class DbUnitTest {

    //Declared as public static to use same webdriver instance publicly
    public DatabaseHandler dbHandler;
    protected static Logger log = LogManager.getLogger(DbUnitTest.class);
    public User users;
    public Movie movie;
    //@BeforeSuite annotation describes this method has to run before all suites
    @BeforeSuite
    public void setup() throws Exception {
        dbHandler= DatabaseHandler.getInstance();
        dbHandler.init();
    }


    //@Test
    public void test2(){
        users = new User(dbHandler);
        log.info(""+dbHandler.testDbConnection());
    }

    @Test
    public void test(){
        users = new User(dbHandler);
        movie = new Movie(dbHandler);
        log.info(""+users.checkExistsByName("marvin@marvin.nl"));
        log.info(""+movie.checkExistsByTitle("Pulp Fiction"));
    }

    //@AfterSuite annotation describes this method has to run after execution of all suites
    @AfterSuite
    public void tearDown() throws Exception {

    }
}