package nl.newnexus.lab.database;

import javax.persistence.*;
import javax.persistence.EntityManagerFactory;

import nl.newnexus.lab.database.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.ejb.HibernateEntityManager;
import org.hibernate.id.uuid.Helper;
import org.hibernate.ejb.HibernateEntityManager.*;

public class DatabaseHandler{
    protected static Logger log = LogManager.getLogger(DatabaseHandler.class);
    private static DatabaseHandler instance = null;
    public static HibernateEntityManager hibernateEntityManager = null;
    public static EntityManager entityManager = null;

    protected DatabaseHandler(){
        // Exists only to defeat instantiation.
    }

    public static boolean init() {
        try{
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
            DatabaseHandler.entityManager = entityManagerFactory.createEntityManager();
            DatabaseHandler.hibernateEntityManager = (HibernateEntityManager) entityManager;
            entityManager.getTransaction().begin();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    public boolean check() {

        //entityManager.
    return true;
    }


    public static DatabaseHandler getInstance() {
        if(instance == null) {
            instance = new DatabaseHandler();
        }
        return instance;
    }

    public String testDbConnection(){
        Query query =  entityManager.createNativeQuery("select 1");
        return  Integer.toString(query.getResultList().size());
    }

}