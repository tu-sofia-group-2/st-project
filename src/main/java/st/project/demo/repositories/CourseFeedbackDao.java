package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import st.project.demo.entites.Course;
import st.project.demo.entites.CourseFeedback;
import st.project.demo.entites.Person;

public interface CourseFeedbackDao extends JpaRepository<CourseFeedback, Long> {
    CourseFeedback getCourseFeedbackByPersonAndCourse(Person person, Course course);
}
