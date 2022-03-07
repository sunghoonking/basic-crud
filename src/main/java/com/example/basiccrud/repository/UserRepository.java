package com.example.basiccrud.repository;

import com.example.basiccrud.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;



import javax.transaction.Transactional;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Optional<User> findById(Long id);

    Optional<User> findByUsernameAndRole(boolean role,String username);

}