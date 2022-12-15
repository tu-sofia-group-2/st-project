package st.project.demo.services;

import org.springframework.stereotype.Service;
import st.project.demo.entites.Faculty;
import st.project.demo.repositories.FacultyDao;

@Service
public class FacultyService {
    private final FacultyDao facultyDao;

    public FacultyService(FacultyDao facultyDao) {
        this.facultyDao = facultyDao;
    }

    public Faculty getFacultyById(Long id){return facultyDao.getById(id);}
}
