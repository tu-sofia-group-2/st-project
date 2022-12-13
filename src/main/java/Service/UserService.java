package Service;

import org.apache.catalina.User;

public interface UserService {
    void saveUser (User user);
    User getUser (Long ID);
    void updateUser (User user);

    void updateUser(User user, Long userID);

    void deleteUserById(Long userID);
}
