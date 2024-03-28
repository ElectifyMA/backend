package com.electify.repositories;

import com.electify.models.entities.PartyBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PartyBranchRepository extends JpaRepository<PartyBranch, UUID> {

}
