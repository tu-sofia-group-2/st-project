package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import st.project.demo.entites.Programme;

public interface ProgrammeDao extends JpaRepository<Programme, Long> {
    public Programme getById(Long id);
}
