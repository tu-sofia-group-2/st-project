package st.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import st.project.demo.entites.Course;
import st.project.demo.services.CourseServiceImpl;
import st.project.demo.services.UserServiceImpl;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

    @Autowired
    private CourseServiceImpl courseService;

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/api/v1/course/get/{id}")
    public Course getCourse(@PathVariable Long id){return courseService.getCourseById(id);}
}
