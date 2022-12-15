package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.Faculty;
import st.project.demo.repositories.FacultyDao;

@Service
public class FacultyServiceImpl implements FacultyService{
    @Autowired
    private FacultyDao facultyDao;
    public Faculty getFacultyById(Long id){return facultyDao.getById(id);}
}
