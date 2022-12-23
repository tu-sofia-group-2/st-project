package st.project.demo.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import st.project.demo.beans.PersonBean;
import st.project.demo.entites.Person;
import st.project.demo.mappers.PersonFactory;
import st.project.demo.services.UserServiceImpl;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private PersonFactory personFactory;
	
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

}
