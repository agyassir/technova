package com.example.technova.Repository;

import com.example.technova.Entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<User , UUID> {
    Optional<Object> findByEmail(String email);
}
