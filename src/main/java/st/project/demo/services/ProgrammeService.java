package st.project.demo.services;

import org.springframework.stereotype.Service;
import st.project.demo.entites.Programme;
import st.project.demo.repositories.ProgrammeDao;

@Service
public class ProgrammeService {
    private final ProgrammeDao programmeDao;

    public ProgrammeService(ProgrammeDao programmeDao) {
        this.programmeDao = programmeDao;
    }

    public Programme getProgrammeById(Long id){return programmeDao.getById(id);}
}
