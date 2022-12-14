package st.project.demo.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import st.project.demo.entites.User;
import st.project.demo.repositories.UserDao;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserDao userRepository;

    @Override
    public void saveUser(User user) {
        if (user == null) {
            throw new NullPointerException();
        }

        userRepository.saveAndFlush(user);
    }

    @Override
    public User getUser(Long id) {
        if (id == null) {
            throw new NullPointerException();
        }

        return userRepository.getById(id);
    }

    @Override
    public void updateUser(User user) {
        //TODO
    }

    @Override
    public void updateUser(User user, Long userId) {
        if (userId == null) {
            throw new NullPointerException();
        }

        userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteUserById(Long userId) {
        if (userId == null) {
            throw new NullPointerException();
        }
        
        userRepository.deleteById(userId);
    }
}
