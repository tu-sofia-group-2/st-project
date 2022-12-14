package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import st.project.demo.entites.Faculty;

public interface FacultyDao extends JpaRepository<Faculty, Long> {
    public Faculty getById(Long id);
}
