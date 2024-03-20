package com.electify.repositories;

import com.electify.models.entities.PartyAdvisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PartyAdvisorRepository extends JpaRepository<PartyAdvisor, UUID> {

}
