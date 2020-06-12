package in.btes.BtesFeedbackPortals.repositories;
import in.btes.BtesFeedbackPortals.entities.Result;
import in.btes.BtesFeedbackPortals.repositories.ResultRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ResultRepository extends CrudRepository<Result, Long> {

}
