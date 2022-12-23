package st.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import st.project.demo.entites.Person;
	
@Repository
public interface UserDao extends JpaRepository<Person, Long> {
	public Person getById(Long id);
	public Person getByUsername(String username);
}
