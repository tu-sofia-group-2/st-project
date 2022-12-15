package st.project.demo.services;

import st.project.demo.entites.User;

public interface UserService {

    User getUserById(Long id);

    User loginUsername(String username);
}

