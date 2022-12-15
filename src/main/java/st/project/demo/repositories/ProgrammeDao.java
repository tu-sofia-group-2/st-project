package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import st.project.demo.entites.Programme;
@Repository
public interface ProgrammeDao extends JpaRepository<Programme, Long> {
    public Programme getById(Long id);
}
