package st.project.demo.service.user;

import st.project.demo.entites.User;

public interface UserService {
    void saveUser (User user);
    User getUser (Long ID);
    void updateUser (User user);

    void updateUser(User user, Long userID);

    void deleteUserById(Long userID);
}
