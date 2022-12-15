package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import st.project.demo.entites.UserProject;
@Repository
public interface UserProjectDao extends JpaRepository<UserProject, Long> {
    public UserProject getById(Long id);
}
