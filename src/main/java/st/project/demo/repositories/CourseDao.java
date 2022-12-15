package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import st.project.demo.entites.Course;
@Repository

public interface CourseDao extends JpaRepository<Course, Long> {
    public Course getById(Long id);
}
