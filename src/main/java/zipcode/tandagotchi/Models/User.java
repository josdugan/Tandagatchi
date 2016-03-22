package zipcode.tandagotchi.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by lucky on 3/14/16.
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "user_id", nullable = false)
    private long id;

    @NotNull
    String first_name;
    @NotNull
    String last_name;
    @NotNull
    String email;

    public User(){

    }

    public User(long id){
        this.id = id;
    }

    public User(String firstName, String lastName, String email){
        this.first_name = firstName;
        this.last_name = lastName;
        this.email = email;
    }

    public String getfirst_name() {
        return first_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


