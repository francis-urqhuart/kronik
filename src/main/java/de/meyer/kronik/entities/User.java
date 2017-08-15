package de.meyer.kronik.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity
public class User {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    private String familyName;

    @Column(length = 50)
    private String givenName;

    @Column(length = 50)
    private String pseudonym;

    @Column(length = 50)
    private String password;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="dd-MM-yyyy")
    private Calendar dayOfBirth;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar lastModifiedDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!id.equals(user.id)) return false;
        if (!familyName.equals(user.familyName)) return false;
        if (!givenName.equals(user.givenName)) return false;
        if (!pseudonym.equals(user.pseudonym)) return false;
        if (!password.equals(user.password)) return false;
        if (!dayOfBirth.equals(user.dayOfBirth)) return false;
        if (!createdDate.equals(user.createdDate)) return false;
        return lastModifiedDate.equals(user.lastModifiedDate);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + familyName.hashCode();
        result = 31 * result + givenName.hashCode();
        result = 31 * result + pseudonym.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + dayOfBirth.hashCode();
        result = 31 * result + createdDate.hashCode();
        result = 31 * result + lastModifiedDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", familyName='" + familyName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", pseudonym='" + pseudonym + '\'' +
                ", password='" + password + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Calendar getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Calendar dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Calendar getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
