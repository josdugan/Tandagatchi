package zipcode.tandagotchi.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by lucky on 3/15/16.
 */
//@NamedNativeQueries({ @NamedNativeQuery(name = "addressQuery", query = "from Address", resultClass = Address.class) })


@Entity
@Table(name = "addresses")
public class Address{

    @Id
//    @GenericGenerator(name="autoGen" ,strategy="increment")
    @GeneratedValue(strategy = GenerationType.AUTO)//generator="autoGen")
//    @Column(name="address_id")
    private Long addressId;
    String street_number;

    String street_name;
    String state;
    String city;
    String zip;
//    @JoinColumn(name = "user_id", updatable = false, insertable = false)
    @OneToOne//(cascade = CascadeType.ALL)//,fetch = FetchType.LAZY)
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address(){

    }

    public Address(String email){
        street_name = email;
        street_number="";
        state="";
        city="";
        zip = "";
    }

    public long getId() {
        return addressId;
    }

    public void setId(long id) {
        this.addressId = id;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreet_number() {
        return street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }

    @Override
    public String toString() {
        return "zipcode.tandagotchi.Models.Address{" +
                "id=" + addressId +
                ", street_number='" + street_number + '\'' +
                ", street_name='" + street_name + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
