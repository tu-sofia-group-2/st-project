package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import st.project.demo.entites.CourseFeedback;

public interface CourseFeedbackDao extends JpaRepository<CourseFeedback, Long> {
}
