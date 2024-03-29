package com.electify.repositories;

import com.electify.models.entities.Candidacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CandidacyRepository extends JpaRepository<Candidacy, UUID> {

}
