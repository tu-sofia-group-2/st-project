package st.project.demo.service.course;

import st.project.demo.entites.Course;

public interface CourseService {
	public Course getCourseById(Long id);
	public Course getCourseByCourseId(Long courseId);
	public Course createCourse(Course course);
	public void deleteCourse(Long id);
	public void deleteCourseByCourseId(Long courseId);
	public Course modifyCourse(Course course);
}
