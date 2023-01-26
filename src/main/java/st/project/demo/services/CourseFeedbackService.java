package st.project.demo.services;

import st.project.demo.entites.CourseFeedback;
import st.project.demo.pojos.requests.AddUpdateCourseFeedbackRequest;

public interface CourseFeedbackService {

    CourseFeedback getCourseFeedbackById(Long id);

    void addCourseFeedback(AddUpdateCourseFeedbackRequest addUpdateCourseFeedbackRequest);

    void updateCourseFeedback(AddUpdateCourseFeedbackRequest addUpdateCourseFeedbackRequest);
}
