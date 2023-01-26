package st.project.demo.services;

import st.project.demo.entites.Course;
import st.project.demo.entites.Person;

import java.util.List;

public interface UserService {

    Person getUserById(Long id);

    Person loginUsername(String username, String password);

    void addPerson(Person person);

    List<Course> getSubjectsByUserId(Long id);
}

