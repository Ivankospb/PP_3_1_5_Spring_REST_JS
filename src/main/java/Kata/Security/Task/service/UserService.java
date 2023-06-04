package Kata.Security.Task.service;


import Kata.Security.Task.model.Role;
import Kata.Security.Task.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    List<Role> getAllRoles();
    void add(User user);
    List<User> getAllUsers();
    void delete(int id);
    void update(User user, int id);
    User getById(int id);
    Optional<User> getByUsername(String userName);

    User getCurrentUser();
}
