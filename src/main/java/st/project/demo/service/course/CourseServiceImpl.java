package st.project.demo.service.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import st.project.demo.entites.Course;
import st.project.demo.repositories.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public Course getCourseById(Long id) {
		if(id == null) {
			throw new NullPointerException();
		}
		
		return courseDao.getById(id);
	}

	@Override
	public Course getCourseByCourseId(Long courseId) {
		if(courseId == null) {
			throw new NullPointerException();
		}
		
		return courseDao.getByCourseId(courseId);
	}

	@Override
	public Course createCourse(Course course) {
		return courseDao.saveAndFlush(course);
	}

	@Override
	public void deleteCourse(Long id) {
		Course course = getCourseById(id);
		courseDao.delete(course);
	}

	@Override
	public void deleteCourseByCourseId(Long courseId) {
		Course course = getCourseByCourseId(courseId);
		courseDao.delete(course);
		
	}

	@Override
	public Course modifyCourse(Course course) {
		return courseDao.saveAndFlush(course);
	}

}
