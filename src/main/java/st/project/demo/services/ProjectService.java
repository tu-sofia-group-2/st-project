package st.project.demo.services;

import org.springframework.stereotype.Service;
import st.project.demo.entites.Project;
import st.project.demo.repositories.ProgrammeDao;
import st.project.demo.repositories.ProjectDao;

@Service
public class ProjectService {
    private final ProjectDao projectDao;

    public ProjectService(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    public Project getProjectById(Long id){return projectDao.getById(id);}
}
