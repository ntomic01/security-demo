package com.example.securitydemo.repository;

import com.example.securitydemo.domain.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Long> {

    Destination findByCity(String city);

    boolean existsByCity(String city);

}
