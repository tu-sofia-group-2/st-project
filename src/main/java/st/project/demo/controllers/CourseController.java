package st.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st.project.demo.entites.Course;
import st.project.demo.services.CourseServiceImpl;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

    @Autowired
    private CourseServiceImpl courseService;

    @GetMapping("/api/v1/course/get/{id}")
    public Course getCourse(@PathVariable Long id){return courseService.getCourseById(id);}
}
