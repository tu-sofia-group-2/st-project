package st.project.demo.services;

import org.springframework.stereotype.Service;
import st.project.demo.entites.Course;
import st.project.demo.repositories.CourseDao;

@Service
public class CourseService {

    private final CourseDao courseDao;

    public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public Course getCourseById(Long id) {return courseDao.getById(id);}
}
