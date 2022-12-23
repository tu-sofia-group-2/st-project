package st.project.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import st.project.demo.entites.Course;
import st.project.demo.entites.Person;
import st.project.demo.entites.UserCourse;

@Repository
public interface UserCourseDao extends JpaRepository<UserCourse, Long>{
	public List<UserCourse> getByUser(Person user);
	public List<UserCourse> getByCourse(Course course);
}
