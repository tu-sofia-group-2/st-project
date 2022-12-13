package Service;


import EntityPackage.User;

public interface UserService {
    void saveUser (EntityPackage.User user);
    void deleteUserById(Long userID);
    EntityPackage.User getUserById(Long id);
    void updateUserById(User user, Long userID);
    User updateUser(User user);
}
