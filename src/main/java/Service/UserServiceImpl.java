package Service;

import Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        if (user == null) {
            throw new NullPointerException();
        }

        userRepository.SaveUser(user);
    }

    @Override
    public User getUser(Long ID) {
        if (ID == null) {
            throw new NullPointerException();
        }

        return userRepository.GetUserByID(ID);
    }

    @Override
    public void updateUser(User user) {
        //TODO
    }

    @Override
    public void updateUser(User user, Long userID) {
        if (userID == null) {
            throw new NullPointerException();
        }

        userRepository.UpdateUser(user);
    }

    @Override
    public void deleteUserById(Long userID) {
        if (userID == null) {
            throw new NullPointerException();
        }
        userRepository.deleteById(userID);
    }
}
