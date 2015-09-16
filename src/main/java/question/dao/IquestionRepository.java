package question.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import question.entities.Question;

/**
 * Created by frederic on 15/09/15.
 */
public interface IquestionRepository extends JpaRepository <Question,Long> {
}
