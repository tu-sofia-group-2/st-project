package st.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st.project.demo.entites.Project;
import st.project.demo.services.ProjectServiceImpl;

@RestController
@RequestMapping("/api/v1/project")
public class ProjectController {
    @Autowired
    private ProjectServiceImpl projectService;

    @GetMapping("/api/v1/project/{id}")
    public Project getProject(@PathVariable Long id){return projectService.getProjectById(id);}
}
