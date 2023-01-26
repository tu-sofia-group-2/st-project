package st.project.demo.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import st.project.demo.beans.PersonBean;
import st.project.demo.entites.Course;
import st.project.demo.entites.Person;
import st.project.demo.entites.Role;
import st.project.demo.mappers.PersonFactory;
import st.project.demo.pojos.requests.AddUserRequest;
import st.project.demo.services.RoleServiceImpl;
import st.project.demo.services.UserServiceImpl;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/user")
public class UserController {
	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private PersonFactory personFactory;

	@Autowired
	private RoleServiceImpl roleService;
	
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<PersonBean> getUser(@PathVariable Long id) {
		return ResponseEntity.ok(personFactory.toPersonBean(userService.getUserById(id)));
	}

	@GetMapping("/login/{username}")
	public ResponseEntity<PersonBean> loginUser(@PathVariable String username, @RequestParam String password) {
		try {
			return ResponseEntity.ok(personFactory.toPersonBean(userService.loginUsername(username, password)));
		} catch(Exception e) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
	}

	@PostMapping("/addUser")
	public ResponseEntity<?> addUser(@RequestBody AddUserRequest addUserRequest) {
		try
		{
			Role role = roleService.getRoleByName(addUserRequest.getRoleName());
			Person person = new Person(addUserRequest, role);
			userService.addPerson(person);
			return ResponseEntity.ok("Person added successfully!");
		}catch (Exception e){
			return ResponseEntity.badRequest().body("Something went wrong! " + e.getMessage());
		}
	}

	@GetMapping("/getCoursesByUserId")
	public ResponseEntity<?> getCoursesByUserId(@RequestParam Long userId){
		try {
			List<Course> courses = userService.getSubjectsByUserId(userId);
			return ResponseEntity.ok().body(courses);
		}catch (Exception e){
			return ResponseEntity.badRequest().body("Something went wrong! " + e.getMessage());
		}
	}
}
