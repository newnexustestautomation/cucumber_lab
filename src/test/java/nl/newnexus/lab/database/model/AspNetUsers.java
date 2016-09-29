
package nl.newnexus.lab.database.model;




import javax.persistence.*;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "AspNetUsers", catalog = "")
public class AspNetUsers implements java.io.Serializable {

    private String id;
    private String email;
    private String emailConfirmed;
    private String passwordHash;
    private String securityStamp;
    private String phoneNumber;
    private String phoneNumberConfirmed;
    private String twoFactorEnabled;
    private Timestamp lockoutEndDateUtc;
    private String lockoutEnabled;
    private int accessFailedCount;
    private String userName;

    public AspNetUsers() {
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    public String getId() {return this.id;}
    public void setId(String id) {this.id = id;}

    @Column(name = "email", unique = true, nullable = false, length = 45)
    public String getemail() {return this.email;}
    public void setemail(String email) {this.email = email;}

    @Column(name = "PhoneNumber", unique = true, nullable = false)
    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    @Column(name = "EmailConfirmed", unique = true, nullable = false)
    public String getEmailConfirmed() {return emailConfirmed;}
    public void setEmailConfirmed(String emailConfirmed) {this.emailConfirmed = emailConfirmed;}

    @Column(name = "PasswordHash", unique = true, nullable = false)
    public String getPasswordHash() {return passwordHash;}
    public void setPasswordHash(String passwordHash) {this.passwordHash = passwordHash;}

    @Column(name = "SecurityStamp", unique = true, nullable = false)
    public String getSecurityStamp() {return securityStamp;}
    public void setSecurityStamp(String securityStamp) {this.securityStamp = securityStamp;}

    @Column(name = "PhoneNumberConfirmed", unique = true, nullable = false)
    public String getPhoneNumberConfirmed() {return phoneNumberConfirmed;}
    public void setPhoneNumberConfirmed(String phoneNumberConfirmed) {this.phoneNumberConfirmed = phoneNumberConfirmed;}

    @Column(name = "TwoFactorEnabled", unique = true, nullable = false)
    public String getTwoFactorEnabled() {return twoFactorEnabled;}
    public void setTwoFactorEnabled(String twoFactorEnabled) {this.twoFactorEnabled = twoFactorEnabled;}

    @Column(name = "LockoutEndDateUtc", unique = true, nullable = false)
    public Timestamp getLockoutEndDateUtc() {return lockoutEndDateUtc;}
    public void setLockoutEndDateUtc(Timestamp lockoutEndDateUtc) {this.lockoutEndDateUtc = lockoutEndDateUtc;}

    @Column(name = "LockoutEnabled", unique = true, nullable = false)
    public String getLockoutEnabled() {return lockoutEnabled;}
    public void setLockoutEnabled(String lockoutEnabled) {this.lockoutEnabled = lockoutEnabled;}

    @Column(name = "AccessFailedCount", unique = true, nullable = false)
    public int getAccessFailedCount() {return accessFailedCount;}
    public void setAccessFailedCount(int accessFailedCount) {this.accessFailedCount = accessFailedCount;}

    @Column(name = "UserName", unique = true, nullable = false)
    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}

}

