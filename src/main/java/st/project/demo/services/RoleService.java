package st.project.demo.services;

import st.project.demo.entites.Role;

public interface RoleService {

    Role getRoleById(Long id);
    Role getRoleByName(String name);

    void addRole(String name);
}
