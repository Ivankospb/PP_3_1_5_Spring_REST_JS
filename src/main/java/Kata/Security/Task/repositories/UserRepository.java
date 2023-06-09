package Kata.Security.Task.repositories;

import Kata.Security.Task.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u join fetch u.roles where u.email=:email")
    Optional<User> findByUsername(String email);

    @Override
    Optional<User> findById(Integer integer);
}
