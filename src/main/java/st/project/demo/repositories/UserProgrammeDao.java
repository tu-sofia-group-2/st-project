package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import st.project.demo.entites.UserProgramme;
@Repository
public interface UserProgrammeDao extends JpaRepository<UserProgramme, Long> {
    public UserProgramme getById(Long id);
}
