package st.project.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import st.project.demo.entites.Course;
import st.project.demo.entites.User;
import st.project.demo.entites.UserCourse;

public interface UserCourseDao extends JpaRepository<UserCourse, Long>{
	public List<UserCourse> getByUser(User user);
	public List<UserCourse> getByCourse(Course course);
}
