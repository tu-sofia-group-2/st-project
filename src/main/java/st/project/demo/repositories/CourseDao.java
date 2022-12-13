package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import st.project.demo.entites.Course;

public interface CourseDao extends JpaRepository<Course, Long> {
    public Course getById(Long id);
}
