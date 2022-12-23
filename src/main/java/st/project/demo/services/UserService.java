package st.project.demo.services;

import st.project.demo.entites.Person;

public interface UserService {

    Person getUserById(Long id);

    Person loginUsername(String username, String password);
}

