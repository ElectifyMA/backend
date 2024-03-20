package com.electify.repositories;

import com.electify.models.entities.Voter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VoterRepository extends JpaRepository<Voter, UUID> {

}
