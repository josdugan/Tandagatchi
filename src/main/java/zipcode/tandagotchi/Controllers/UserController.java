package zipcode.tandagotchi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import zipcode.tandagotchi.Models.Address;
import zipcode.tandagotchi.Models.User;
import zipcode.tandagotchi.Repositories.AddressRepository;
import zipcode.tandagotchi.Repositories.UserRepository;

/**
 * Created by lucky on 3/14/16.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser(){
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject("http://api.reimaginebanking.com/customers/56c66be5a73e49274150743d?key=13fac81d44240f953ae727d6883e439d", User.class);
        return user;
    }

    /**
     * GET /create  --> Create a new user and save it in the database.
     */
    @RequestMapping("/create")
    @ResponseBody
    public String create(String firstName, String lastName,String email) {

        User user = new User(firstName, lastName, email);
        Address address = new Address(email);
        try {

            user.setAddress(address);

            userRepository.save(user);
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "zipcode.tandagotchi.Models.User succesfully created with id = " + user + "\n" + user.getAddress();
    }

    /**
     * GET /delete  --> Delete the user having the passed id.
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam long id) {
        try {
            User user = new User(id);
            userRepository.delete(user);
        }
        catch (Exception ex) {
            return "Error deleting the user:" + ex.toString();
        }
        return "zipcode.tandagotchi.Models.User succesfully deleted!";
    }

    /**
     * GET /get-by-email  --> Return the id for the user having the passed
     * email.
     */
    @RequestMapping("/get-by-email")
    @ResponseBody
    public String getByEmail(@RequestParam String email) {
        String userId = "";
        try {
            User user = userRepository.findByEmail(email);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "zipcode.tandagotchi.Models.User not found";
        }
        return "The user id is: " + userId;
    }

    /**
     * GET /update  --> Update the email and the name for the user in the
     * database having the passed id.
     */
    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(@RequestParam long id, String firstName, String lastName, String email) {
        try {
            User user = userRepository.findOne(id);
            user.setEmail(email);
            user.setfirst_name(firstName);
            user.setlast_name(lastName);
            userRepository.save(user);
        }
        catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "zipcode.tandagotchi.Models.User succesfully updated!";
    }

    // Private fields

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

}
