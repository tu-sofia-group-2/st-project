package st.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.project.demo.entites.Role;
import st.project.demo.repositories.RoleDao;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleDao roleDao;
    public Role getRoleById(Long id){return roleDao.getById(id);}
    public Role getRoleByName(String name) {return roleDao.getByName(name);}
    public void addRole(String name) {
        Role role = new Role(name);
        roleDao.save(role);
    }
}
