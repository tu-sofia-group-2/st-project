package st.project.demo.endpoints.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import st.project.demo.endpoints.beans.UserOutBean;

@Controller("/api/v1/users/")
public class UserApi {

	@GetMapping("{userId}")
	public UserOutBean getUserByUserId(@PathVariable Long userId) {
		return null;
	}
}
