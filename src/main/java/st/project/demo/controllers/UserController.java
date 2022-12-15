package st.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st.project.demo.entites.User;
import st.project.demo.services.UserServiceImpl;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/api/v1/user/get/{id}")
    public User getUser(@PathVariable Long id){return userService.getUserById(id);}
    @GetMapping("/api/v1/user/get/{username}")
    public User loginUser(@PathVariable String username){return userService.loginUsername(username);}



}
