package nl.newnexus.lab.database;

import nl.newnexus.lab.database.model.AspNetUsers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.persistence.Query;

public class User {
    protected static Logger log = LogManager.getLogger(User.class);
    private DatabaseHandler dbHandler;

    public User(DatabaseHandler dbHandler) {
        this.dbHandler = dbHandler;
    }



    public boolean checkExistsByName(String username){

        Query query =  dbHandler.entityManager.createQuery("select a from AspNetUsers a where a.userName = '"+username+"'");
        AspNetUsers users = (AspNetUsers) query.getResultList().get(0);
        log.info(users.getUserName());

        log.info(query.getResultList().get(0));

        if(query.getResultList().size()>0)
            return true;
        return false;

    }


}