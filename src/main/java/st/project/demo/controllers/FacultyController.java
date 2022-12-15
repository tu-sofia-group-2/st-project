package st.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st.project.demo.entites.Faculty;
import st.project.demo.services.FacultyServiceImpl;

@RestController
@RequestMapping("/api/v1/faculty")
public class FacultyController {
    @Autowired
    private FacultyServiceImpl facultyService;

    @GetMapping("/api/v1/faculty/get/{id}")
    public Faculty getFaculty(@PathVariable Long id){return facultyService.getFacultyById(id);}

}
