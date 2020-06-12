package in.btes.BtesFeedbackPortals.repositories;
import in.btes.BtesFeedbackPortals.entities.User;
import in.btes.BtesFeedbackPortals.entities.adminEntity;
import in.btes.BtesFeedbackPortals.repositories.adminRepository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface adminRepository extends CrudRepository<adminEntity, Long>{

	void deleteById(Long id);
	Optional<adminEntity> findById(Long id);
}