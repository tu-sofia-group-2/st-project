package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import st.project.demo.entites.Faculty;
@Repository
public interface FacultyDao extends JpaRepository<Faculty, Long> {
    public Faculty getById(Long id);
}
