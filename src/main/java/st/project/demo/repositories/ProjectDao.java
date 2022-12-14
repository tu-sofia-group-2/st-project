package st.project.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import st.project.demo.entites.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Long> {
	public Project getById(Long id);
}
