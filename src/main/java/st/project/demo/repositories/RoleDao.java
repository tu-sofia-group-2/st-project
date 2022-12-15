package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import st.project.demo.entites.Role;
@Repository

public interface RoleDao extends JpaRepository<Role, Long> {
    public Role getById(Long id);
}
