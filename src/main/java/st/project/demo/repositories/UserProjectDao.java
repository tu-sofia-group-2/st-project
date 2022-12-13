package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import st.project.demo.entites.UserProject;

public interface UserProjectDao extends JpaRepository<UserProject, Long> {
    public UserProject getById(Long id);
}
