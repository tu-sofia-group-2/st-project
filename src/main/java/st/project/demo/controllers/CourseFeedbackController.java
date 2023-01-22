package st.project.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st.project.demo.entites.CourseFeedback;
import st.project.demo.services.CourseFeedbackServiceImpl;

@RestController
@RequestMapping("/api/v1/courseFeedback")
public class CourseFeedbackController {

    private CourseFeedbackServiceImpl courseFeedbackService;

    @GetMapping("/api/v1/courseFeedback/get/{id}")
    public CourseFeedback getCourse(@PathVariable Long id){return courseFeedbackService.getCourseFeedbackById(id);}
}
