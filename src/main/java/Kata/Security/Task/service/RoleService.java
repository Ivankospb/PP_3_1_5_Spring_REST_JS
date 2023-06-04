package Kata.Security.Task.service;



import Kata.Security.Task.model.Role;

import java.util.List;

public interface RoleService {
    void add(Role role);

    List<Role> getListRoles();

    List<Role> getRolesListById(List<Integer> id);

    Role getRoleById(int id);
}
