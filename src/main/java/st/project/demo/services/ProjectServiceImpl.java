package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.Project;
import st.project.demo.repositories.ProjectDao;

@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    private ProjectDao projectDao;
    public Project getProjectById(Long id){return projectDao.getById(id);}
}
