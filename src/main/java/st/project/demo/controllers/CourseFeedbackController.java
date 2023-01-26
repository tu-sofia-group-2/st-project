package st.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import st.project.demo.entites.CourseFeedback;
import st.project.demo.pojos.requests.AddUpdateCourseFeedbackRequest;
import st.project.demo.services.CourseFeedbackServiceImpl;

@RestController
@RequestMapping("/api/v1/courseFeedback")
public class CourseFeedbackController {

    @Autowired
    private CourseFeedbackServiceImpl courseFeedbackService;

    @GetMapping("/api/v1/courseFeedback/get/{id}")
    public CourseFeedback getCourse(@PathVariable Long id){return courseFeedbackService.getCourseFeedbackById(id);}

    @PostMapping("/addFeedback")
    public ResponseEntity<?> addFeedback(@RequestBody AddUpdateCourseFeedbackRequest addUpdateCourseFeedbackRequest){
        try {
            courseFeedbackService.addCourseFeedback(addUpdateCourseFeedbackRequest);
            return ResponseEntity.ok("Added course feedback successfully!");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Something went wrong! " + e.getMessage());
        }
    }

    @PutMapping("/updateFeedback")
    public ResponseEntity<?> updateFeedback(@RequestBody AddUpdateCourseFeedbackRequest addUpdateCourseFeedbackRequest){
        try {
            courseFeedbackService.updateCourseFeedback(addUpdateCourseFeedbackRequest);
            return ResponseEntity.ok("Added course feedback successfully!");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Something went wrong! " + e.getMessage());
        }
    }


}
