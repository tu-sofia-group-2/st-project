package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import st.project.demo.entites.UserProgramme;

public interface UserProgrammeDao extends JpaRepository<UserProgramme, Long> {
    public UserProgramme getById(Long id);
}
