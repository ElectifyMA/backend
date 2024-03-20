package com.electify.repositories;

import com.electify.models.entities.PartyPresident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PartyPresidentRepository extends JpaRepository<PartyPresident, UUID> {

}
