package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.Person;
import st.project.demo.repositories.UserDao;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    
    public Person getUserById(Long id){return userDao.getById(id);}

    public Person loginUsername(String username, String password){
    	Person user = userDao.getByUsername(username);
    	if(user.getPassword().contentEquals(password))
    		return user;
    	
    	throw new IllegalArgumentException();
    }
}
