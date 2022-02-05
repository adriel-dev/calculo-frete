package com.adriel.frete.repositories;

import com.adriel.frete.models.Frete;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreteRepository extends JpaRepository<Frete, Long> {
    
}