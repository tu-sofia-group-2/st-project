package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.Course;
import st.project.demo.entites.Person;
import st.project.demo.entites.UserCourse;
import st.project.demo.repositories.UserCourseDao;
import st.project.demo.repositories.UserDao;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserCourseDao userCourseDao;
    
    public Person getUserById(Long id){return userDao.getById(id);}

    public Person loginUsername(String username, String password){
    	Person user = userDao.getByUsername(username);
    	if(user.getPassword().contentEquals(password))
    		return user;
    	
    	throw new IllegalArgumentException();
    }

    public void addPerson(Person person) {
        userDao.save(person);
    }

    public List<Course> getSubjectsByUserId(Long id) {
        Person person = userDao.getById(id);
        List<UserCourse> userCourses = userCourseDao.getByUser(person);
        ArrayList<Course> courses = new ArrayList<>();
        for (UserCourse userCourse : userCourses){
            courses.add(userCourse.getCourse());
        }
        return courses;
    }

}
