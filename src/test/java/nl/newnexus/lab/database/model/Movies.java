package nl.newnexus.lab.database.model;


/*id
title
director
datereleased*/

import javax.persistence.*;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Movies", catalog = "")
public class Movies implements java.io.Serializable {

    private Integer id;
    private String title;
    private String director;
    private Timestamp dateReleased;

    public Movies() {
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "Title", unique = false, nullable = false)
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title= title;
    }

    @Column(name = "director", unique = true, nullable = false)
    public String getDirector() {return director;}
    public void setDirector(String director) {this.director = director;}

    @Column(name = "dateReleased", unique = true, nullable = false)
    public Timestamp getDateReleased() {return dateReleased;}
    public void setDateReleased(Timestamp dateReleased) {this.dateReleased = dateReleased;}

}