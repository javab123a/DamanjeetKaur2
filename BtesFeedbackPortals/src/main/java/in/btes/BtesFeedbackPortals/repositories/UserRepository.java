package in.btes.BtesFeedbackPortals.repositories;
import in.btes.BtesFeedbackPortals.entities.User;
import in.btes.BtesFeedbackPortals.repositories.UserRepository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<User, String>{

	void deleteById(String id);
	void save(Long id);
	Optional<User> findByPassword(String password);
	Optional<User> findById(String id);
}