package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.CourseFeedback;
import st.project.demo.repositories.CourseFeedbackDao;

@Service
public class CourseFeedbackServiceImpl implements CourseFeedbackService{

    @Autowired
    private CourseFeedbackDao courseFeedbackDao;

    @Override
    public CourseFeedback getCourseFeedbackById(Long id) {
        return courseFeedbackDao.getById(id);
    }
}
