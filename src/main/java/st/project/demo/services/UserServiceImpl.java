package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.User;
import st.project.demo.repositories.UserDao;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    public User getUserById(Long id){return userDao.getById(id);}

    public User loginUsername(String username){return userDao.getByUsername(username);}
}
