package zipcode.tandagotchi.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by lucky on 3/14/16.
 */

@Entity
@Table(name = "users")
public class User {

    @Id
//    @GenericGenerator(name="autoGen" ,strategy="increment")
    @GeneratedValue(strategy=GenerationType.AUTO)//"autoGen")
//    @Column(name="user_id")
    private long userId;

    @NotNull
    String first_name;
    @NotNull
    String last_name;
    @NotNull
    String email;
    @OneToOne(fetch = FetchType.LAZY,mappedBy="user", cascade = CascadeType.ALL)
    private Address address;


    public User() {

    }

    public User(long id) {
        this.userId = id;
    }

    public User(String firstName, String lastName, String email) {
        this.first_name = firstName;
        this.last_name = lastName;
        this.email = email;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getfirst_name() {
        return first_name;
    }

    public long getId() {
        return userId;
    }

    public void setId(long id) {
        this.userId = id;
    }

    public void setfirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getlast_name() {
        return last_name;
    }

    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    @Override
    public String toString() {
        return "zipcode.tandagotchi.Models.User{" +
                "id=" + userId +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


