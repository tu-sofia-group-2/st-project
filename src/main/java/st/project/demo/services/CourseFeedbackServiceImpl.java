package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.Course;
import st.project.demo.entites.CourseFeedback;
import st.project.demo.entites.Person;
import st.project.demo.pojos.requests.AddUpdateCourseFeedbackRequest;
import st.project.demo.repositories.CourseFeedbackDao;

import java.util.Date;

@Service
public class CourseFeedbackServiceImpl implements CourseFeedbackService{

    @Autowired
    private CourseFeedbackDao courseFeedbackDao;

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private CourseServiceImpl courseService;

    @Override
    public CourseFeedback getCourseFeedbackById(Long id) {
        return courseFeedbackDao.getById(id);
    }

    @Override
    public void addCourseFeedback(AddUpdateCourseFeedbackRequest addUpdateCourseFeedbackRequest) {
        Person person = userService.getUserById(addUpdateCourseFeedbackRequest.getUserId());
        Course course = courseService.getCourseById(addUpdateCourseFeedbackRequest.getCourseId());
        CourseFeedback courseFeedback = new CourseFeedback(person, course, addUpdateCourseFeedbackRequest.getDescription());
        courseFeedbackDao.save(courseFeedback);
    }

    @Override
    public void updateCourseFeedback(AddUpdateCourseFeedbackRequest addUpdateCourseFeedbackRequest) {
        Person person = userService.getUserById(addUpdateCourseFeedbackRequest.getUserId());
        Course course = courseService.getCourseById(addUpdateCourseFeedbackRequest.getCourseId());
        CourseFeedback courseFeedback = courseFeedbackDao.getCourseFeedbackByPersonAndCourse(person, course);
        courseFeedback.setDescription(addUpdateCourseFeedbackRequest.getDescription());
        courseFeedback.setDate(new Date());
        courseFeedbackDao.save(courseFeedback);
    }
}
