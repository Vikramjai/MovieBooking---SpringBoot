package com.example.moviebooking2.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.moviebooking2.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
