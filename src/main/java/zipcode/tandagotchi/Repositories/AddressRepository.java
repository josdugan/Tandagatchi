package zipcode.tandagotchi.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import zipcode.tandagotchi.Models.Address;

/**
 * Created by lucky on 3/21/16.
 */
@Transactional
public interface AddressRepository extends CrudRepository<Address,Long> {
}
