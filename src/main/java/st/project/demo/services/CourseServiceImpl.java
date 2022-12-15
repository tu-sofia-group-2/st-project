package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.Course;
import st.project.demo.repositories.CourseDao;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    public Course getCourseById(Long id) {return courseDao.getById(id);}
}
