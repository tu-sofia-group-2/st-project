package Controller;

import Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired private UserService userService;

    @PostMapping("/users")
    public void saveUser(@RequestBody User user) {
        if (user == null) {
            throw new NullPointerException();
        }

        userService.SaveUser(user);
    }

    @GetMapping("/users")
    public User getUser(@RequestBody Long ID) {
        if (ID == null) {
            throw new NullPointerException();
        }

        return userService.GetUserByID(ID);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable("id") Long userID) {
        if (userID == null) {
            throw new NullPointerException();
        }

        userService.UpdateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long userID)
    {
        if (userID == null) {
            throw new NullPointerException();
        }

        userService.deleteUserById(userID);
        return "Deleted Successfully";
    }
}
