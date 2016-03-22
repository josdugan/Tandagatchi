package zipcode.tandagotchi.Repositories;

import org.springframework.data.repository.CrudRepository;
import zipcode.tandagotchi.Models.User;

import javax.transaction.Transactional;

/**
 * Created by lucky on 3/14/16.
 */


@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

     public User findByEmail(String email);

}
