package st.project.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st.project.demo.entites.Programme;
import st.project.demo.repositories.ProgrammeDao;
import st.project.demo.services.ProgrammeService;

@RestController
@RequestMapping("/api/v1/programme")
public class ProgrammeController {
    private final ProgrammeService programmeService;

    public ProgrammeController(ProgrammeService programmeService) {
        this.programmeService = programmeService;
    }
    @GetMapping("/api/v1/programme/get/{id}")
    public Programme getProgramme(@PathVariable Long id){return programmeService.getProgrammeById(id);}
}