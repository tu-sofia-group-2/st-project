package st.project.demo.pojos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddUpdateCourseFeedbackRequest {
    private Long userId;
    private Long courseId;
    private String description;
}
