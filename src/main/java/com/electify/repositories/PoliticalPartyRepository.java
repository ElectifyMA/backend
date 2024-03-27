package com.electify.repositories;

import com.electify.models.entities.PoliticalParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PoliticalPartyRepository extends JpaRepository<PoliticalParty, UUID> {

}
