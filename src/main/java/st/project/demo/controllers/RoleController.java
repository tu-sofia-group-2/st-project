package st.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st.project.demo.entites.Role;
import st.project.demo.services.RoleServiceImpl;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
    @Autowired
    private RoleServiceImpl roleService;

    @GetMapping("/api/v1/role/{id}")
    public Role getRole(@PathVariable Long id){return roleService.getRoleById(id);}
}
