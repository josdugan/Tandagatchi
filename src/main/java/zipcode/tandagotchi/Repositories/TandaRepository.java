package zipcode.tandagotchi.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zipcode.tandagotchi.Models.Tanda;

import javax.transaction.Transactional;

/**
 * Created by lucky on 3/14/16.
 */


@Transactional
@Repository
public interface TandaRepository extends CrudRepository<Tanda, Long> {

    public Tanda findById(long id);

}
