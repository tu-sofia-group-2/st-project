package st.project.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import st.project.demo.entites.Role;
import st.project.demo.repositories.RoleDao;

@Service
public class RoleService {
    private final RoleDao roleDao;

    public RoleService(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public Role getRoleById(Long id){return roleDao.getById(id);}
}
