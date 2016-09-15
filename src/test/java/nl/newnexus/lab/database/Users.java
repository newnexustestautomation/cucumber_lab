package nl.newnexus.lab.database;

import nl.newnexus.lab.database.model.Movies;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.ejb.HibernateEntityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Users {
    protected static Logger log = LogManager.getLogger(Users.class);
    private DatabaseHandler dbHandler;

    public Users(DatabaseHandler dbHandler) {
        this.dbHandler = dbHandler;
    }



    public boolean checkExistsByName(String username){

        Query query =  dbHandler.entityManager.createNativeQuery("select cast(email as varchar) from aspnetusers where username = '"+username+"'");
        log.info(query.getResultList().get(0));

        if(query.getResultList().size()>0)
            return true;
        return false;

    }


}