package com.electify.repositories;

import com.electify.models.entities.Election;
import com.electify.models.enums.ElectionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ElectionRepository extends JpaRepository<Election, UUID> {
    Optional<Election> findTopByStatusOrderByCreatedAtDesc(ElectionStatus status);
}
