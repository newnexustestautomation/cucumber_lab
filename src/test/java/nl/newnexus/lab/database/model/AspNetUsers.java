
package nl.newnexus.lab.database.model;


/*INSERT INTO [dbo].[AspNetUsers]


        ([Id],
        [Email],
        [EmailConfirmed],
        [PasswordHash],
        [SecurityStamp],
        [PhoneNumber],
        [PhoneNumberConfirmed],
        [TwoFactorEnabled],
        [LockoutEndDateUtc],
        [LockoutEnabled],
        [AccessFailedCount],
        [UserName])
        VALUES (N'4eaca81e-8db1-402c-92f6-78eeecfbfeef',
        N'a@a.com',
        0,
        N'AJch4riinRtRvwz7lAW2FWpGETirWVFst2W83sUZThSo07f29QceelmzUFXQYxsOEQ==',
        N'151dd51d-7059-44b7-8b13-7473c5026751',
        NULL,
        0,
        0,
        NULL,
        1,
        0,
        N'a@a.com')*/

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "email", catalog = "")
public class AspNetUsers implements java.io.Serializable {

    private Integer id;
    private String email;

    public AspNetUsers() {
    }

    public AspNetUsers(String email) {
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "email", unique = true, nullable = false, length = 45)
    public String getemail() {
        return this.email;
    }

    public void setemail(String email) {
        this.email = email;
    }

}

