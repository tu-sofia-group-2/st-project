package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.Programme;
import st.project.demo.repositories.ProgrammeDao;

@Service
public class ProgrammeServiceImpl implements ProgrammeService{
    @Autowired
    private ProgrammeDao programmeDao;
    public Programme getProgrammeById(Long id){return programmeDao.getById(id);}
}
