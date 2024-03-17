package com.electify.repositories;

import com.electify.models.entities.NationalListBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NationalListBranchRepository extends JpaRepository<NationalListBranch, UUID> {

}
