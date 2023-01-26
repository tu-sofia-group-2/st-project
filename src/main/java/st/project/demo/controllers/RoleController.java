package st.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import st.project.demo.entites.Role;
import st.project.demo.services.RoleServiceImpl;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
    @Autowired
    private RoleServiceImpl roleService;

    @GetMapping("/api/v1/role/{id}")
    public Role getRole(@PathVariable Long id){return roleService.getRoleById(id);}

    @PostMapping("/addRole")
    public ResponseEntity<?> addRole(@RequestParam String name){
        try{
            roleService.addRole(name);
            return ResponseEntity.ok("Role added successfully!");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Something went wrong! " + e.getMessage());
        }
    }
}
