package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import st.project.demo.entites.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
    public Role getById(Long id);
}
