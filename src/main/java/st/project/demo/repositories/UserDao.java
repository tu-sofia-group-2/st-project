package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import st.project.demo.entites.User;
	
@Repository
public interface UserDao extends JpaRepository<User, Long> {
	public User getById(Long id);
	public User getByUsername(String username);
}
