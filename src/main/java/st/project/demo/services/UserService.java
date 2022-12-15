package st.project.demo.services;

import org.springframework.stereotype.Service;
import st.project.demo.entites.User;
import st.project.demo.repositories.UserDao;

import javax.persistence.SecondaryTable;

@Service
public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserById(Long id){return userDao.getById(id);}

    public User loginUsername(String username){return userDao.getByUsername(username);}
}
