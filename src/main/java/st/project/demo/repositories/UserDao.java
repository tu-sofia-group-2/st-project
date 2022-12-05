package st.project.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import st.project.demo.entites.User;
	
public interface UserDao extends JpaRepository<Long, User> {
	public List<User> getById(Long id);
}
