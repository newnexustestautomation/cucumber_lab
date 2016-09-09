package nl.newnexus.lab.database;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import nl.newnexus.lab.database.model.Movies;
import javax.persistence.Query;

public class Movie {
    protected static Logger log = LogManager.getLogger(Movie.class);
    private DatabaseHandler dbHandler;

    public Movie(DatabaseHandler dbHandler) {
        this.dbHandler = dbHandler;
    }



    public boolean checkExistsByTitle(String title){

        Query query =  dbHandler.entityManager.createQuery("select m from Movies m");  //= '"+username+"'");
        Movies movies = (Movies) query.getResultList().get(0);
        log.info(movies.getTitle());

        if(query.getResultList().size()>0)
            return true;
        return false;
 
    }


}