package in.btes.BtesFeedbackPortals.repositories;
import in.btes.BtesFeedbackPortals.entities.admins;
import in.btes.BtesFeedbackPortals.repositories.AdmindataRepository;

import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdmindataRepository extends CrudRepository<admins, Long>{

	Optional<admins> findByEmail(String email);

	Optional<admins> findByPassword(String password);

}