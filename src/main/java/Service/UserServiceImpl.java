package Service;

import EntityPackage.User;
import Repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserDao userRepository;

    @Override
    public void saveUser(EntityPackage.User user) {
        if (user == null) {
            throw new NullPointerException();
        }

        userRepository.saveUser(user);
    }

    @Override
    public EntityPackage.User getUserById(Long id) {
        if (id == null) {
            throw new NullPointerException();
        }

        return userRepository.getUserByID(id);
    }

    @Override
    public void updateUserById(User user, Long userID) {
        if (userID == null) {
            throw new NullPointerException();
        }
        userRepository.updateUser(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public void deleteUserById(Long userID) {
        if (userID == null) {
            throw new NullPointerException();
        }
        userRepository.deleteById(userID);
    }


}
