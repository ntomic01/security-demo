package com.example.securitydemo.repository;

import com.example.securitydemo.domain.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SystemUser, Long> {

    SystemUser findByUsername(String username);

}
